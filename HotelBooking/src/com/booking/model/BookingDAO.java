package com.booking.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.board.model.BoardDAOImpl;
import com.board.model.BoardDTO;
import com.file.model.FileDTO;
import com.member.model.MemberVO;

public class BookingDAO {
	//DB연동
		private static BookingDAO instance = new BookingDAO();
		public static BookingDAO getInstance() {
			return instance;
		}
		private Connection getConnection() throws Exception{
			Context initCtx = new InitialContext();
			Context envCtx = (Context) initCtx.lookup("java:comp/env");
			DataSource ds = (DataSource) envCtx.lookup("jdbc/member");
			return ds.getConnection();
		}
		
		//추가
		
		public void bookingInsert(BookingDTO booking) {
			Connection con = null;
			PreparedStatement ps = null;
			
			try {
				con = getConnection();
				String sql = "insert into bookingcheck (num, hotel_name, hotel_addr, hotel_repu, hotel_price, checkin, checkout, rooms_count)"
						+ "values (board_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
				ps = con.prepareStatement(sql);
				ps.setString(1, booking.getHotel_name());
				ps.setString(2, booking.getHotel_addr());
				ps.setString(3, booking.getHotel_repu());
				ps.setString(4, booking.getHotel_price());
				ps.setString(5, booking.getCheckin());
				ps.setString(6, booking.getCheckout());
				ps.setInt(7, booking.getRooms_count());
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeConnection(con, ps);
			}
			
		}
		
		
		//전체보기
		public ArrayList<BookingDTO> bookingList() {
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			BookingDTO dto = null;
			ArrayList<BookingDTO> arr = new ArrayList<>();
			
			try {
				con = getConnection();
				String sql = "select * from bookingcheck";
				st = con.createStatement();
				rs = st.executeQuery(sql);
				while(rs.next()) {
					dto = new BookingDTO();
					dto.setNum(rs.getInt("num"));
					dto.setHotel_name(rs.getString("hotel_name"));
					dto.setHotel_addr(rs.getString("hotel_addr"));
					dto.setHotel_repu(rs.getString("hotel_repu"));
					dto.setHotel_price(rs.getString("hotel_price"));
					dto.setCheckin(rs.getString("checkin"));
					dto.setCheckout(rs.getString("checkout"));
					dto.setRooms_count(rs.getInt("rooms_count"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeConnection(con, st, rs);
			}
			return arr;
		}
		
		
		
		
		public int bookingCount() {
			// TODO Auto-generated method stub
			return 0;
		}
		
		//갯수
		public int getCount() {
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			int count=0;
			
			try {
				con=getConnection();
				String sql = "select count(*) from bookingcheck";
				st = con.createStatement();
				rs = st.executeQuery(sql);
				if(rs.next()) {
					count=rs.getInt(1);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				closeConnection(con, st, rs);
			}return count;
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
