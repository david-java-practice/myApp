package com.file.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class FileDAO {
	
	//DB연동
		private static FileDAO instance = new FileDAO();
		public static FileDAO getInstance() {
			return instance;
		}
		private Connection getConnection() throws Exception{
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/member");
			return ds.getConnection();
		}
		
		
	//파일추가
		public void testInsert(FileDTO file) {
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				con = getConnection();
				String sql = "insert into fileupload values (fileupload_seq.nextval,?,?,?,?,?)";
				ps=con.prepareStatement(sql);
				ps.setString(1, file.getHotel_name());
				ps.setString(2, file.getHotel_addr());
				ps.setString(3, file.getHotel_repu());
				ps.setString(4, file.getHotel_price());
				ps.setString(5, file.getUploadFile());
				ps.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				closeConnection(con, ps);
			}
		}
		
		//전체보기
				public ArrayList<FileDTO> fileList(String field, String word, int startRow, int endRow) {
					Connection con = null;
					PreparedStatement ps = null;
					ResultSet rs = null;
					ArrayList<FileDTO> arr = new ArrayList<>();
					StringBuilder sb = new StringBuilder();
					try {
						con = getConnection();
						if(word.equals("")) {
							sb.append("select * from");
							sb.append(" (select aa.*,rownum rn from");
							sb.append(" (select * from fileupload order by num desc)aa");
							sb.append(" where rownum<=?) where rn >=?");
							
							
						}else {
							sb.append("select * from");
							sb.append(" (select aa.*,rownum rn from");
							sb.append(" (select * from fileupload where "+field +" like '%"+word+"%'");
							sb.append(" order by num desc)aa");
							sb.append(" where rownum<=?) where rn >=?");	
						}
						//System.out.println(sb.toString());
						ps = con.prepareStatement(sb.toString());
						ps.setInt(1, endRow);
						ps.setInt(2, startRow);
					
						rs = ps.executeQuery();
						while(rs.next()) {
							FileDTO dto = new FileDTO();
							dto.setNum(rs.getInt("num"));
							dto.setHotel_name(rs.getString("hotel_name"));
							dto.setHotel_addr(rs.getString("hotel_addr"));
							dto.setHotel_repu(rs.getString("hotel_repu"));
							dto.setHotel_price(rs.getString("hotel_price"));
							dto.setUploadFile(rs.getString("uploadFile"));
							arr.add(dto);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}finally {
						closeConnection(con, ps, rs);
					}
					return arr;
					
				}
				
				//갯수 - 검색포함
				
				public int fileCount(String field, String word) {
					Connection con = null;
					Statement st = null;
					ResultSet rs = null;
					int count = 0;
					String sql = "";
					
					try {
						con = getConnection();
						st = con.createStatement();
						if(word.equals("")) {
							 sql = "SELECT COUNT(*) FROM fileupload";
						}else {
							sql = "SELECT COUNT(*) FROM fileupload where "+field+" like '%"+word+"%'";
						}
						rs = st.executeQuery(sql);
						if(rs.next()) {
							count = rs.getInt(1);
						}
					} catch (Exception e) {
						e.printStackTrace();
					}finally {
						closeConnection(con, st, rs);
					}
					return count;
				}
		
		
		//닫기
		private void closeConnection(Connection con, PreparedStatement ps) {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		private void closeConnection(Connection con, Statement st, ResultSet rs) {
			try {
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
		
}
