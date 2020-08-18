package com.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Name;
import javax.sql.DataSource;

public class AddressDAO {
	private static AddressDAO instance = new AddressDAO();
	
	public static AddressDAO getInstance() {
		return instance;
	}
	//DB연결
	//*DBCP를 이용해서 연결 , *JNDI 이름으로 찾는방법
	private Connection getConnection() throws Exception{
		Context initCtx = new InitialContext();
		Context envCtx = (Context)initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/jsp");		
		return ds.getConnection();
		
	}
	
	
	//추가
	public void addrInsert(Address ad) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			
			con = getConnection();
			String sql = "insert into address values(address_seq.nextval"
					+ ",?,?,?,?)";
			ps=con.prepareStatement(sql);
			ps.setString(1, ad.getName());
			ps.setString(2, ad.getZipcode());
			ps.setString(3, ad.getTel());
			ps.setString(4, ad.getAddr());
			
			ps.executeUpdate();
			
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeConnection(con,ps);
		}
		
	}
	
	
	//수정
	public void addrUpdate(Address ad) {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con =getConnection();
			String sql = "update address set name=?, zipcode=?, addr=?,"
					+ "tel=? where num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, ad.getName());
			ps.setString(2, ad.getZipcode());
			ps.setString(3, ad.getAddr());
			ps.setString(4, ad.getTel());
			ps.setLong(5, ad.getNum());
			ps.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeConnection(con, ps);
		}
	}
	
	//전체보기
	public ArrayList<Address> addrList() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Address> arr = new ArrayList<>();
		
		try {
			con = getConnection();
			String sql="select*from address";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				Address ad = new Address();
				ad.setAddr(rs.getString("addr"));
				ad.setName(rs.getString("name"));
				ad.setNum(rs.getShort("num"));
				ad.setTel(rs.getString("tel"));
				ad.setZipcode(rs.getString("zipcode"));
				arr.add(ad);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			closeConnection(con,  st, rs);
		}
		return arr;
		
	}
	
	//삭제
	
	//상세보기
	public Address addrDetail(int num) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		Address ad = null;
		
		try {
			con = getConnection();
			String sql = "select * from address where num="+num;
			st = con.createStatement();
			rs = st.executeQuery(sql);
			if(rs.next()){
				ad = new Address();
				ad.setAddr(rs.getString("addr"));
				ad.setName(rs.getString("name"));
				ad.setNum(rs.getLong("num"));
				ad.setTel(rs.getString("tel"));
				ad.setZipcode(rs.getString("zipcode"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConnection(con,  st, rs);
		}
		return ad;
	}
	
	//닫기
	public void closeConnection(Connection con, PreparedStatement ps) {
		try {
			if(ps!=null) ps.close();
			if(con!=null) con.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
		public void closeConnection(Connection con, Statement st,
				ResultSet rs) {
			
		}

}
