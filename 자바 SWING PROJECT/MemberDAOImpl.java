package swingProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class MemberDAOImpl implements MemberDAO{
	String url, user, pwd;
	
	//DB연결 메소드
	public MemberDAOImpl() {
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");	// 다른 DB를 쓸 경우 바꿔주면됨
		 url = "jdbc:oracle:thin:@localhost:1521:xe";	// 내컴퓨터에 저장되어 있는 오라클 호스트이름"localhost", 오라클이 저장되어 있는 포트: "1521", 교육용버전: "xe"
		 user="scott";
		 pwd ="1234";
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
		
		}

	}
	

	
	
	//회원 등록
	public int memberInsert(Member m) {
		Connection con = null;		//연결
		PreparedStatement ps = null;	//명령
		int r=0;
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			String sql = "insert into member(id,pwd,name,tel,"+
					"addr,birth,job,gender,email) values (?,?,?,?,?,?,?,?,?)";
			
			ps=con.prepareStatement(sql);
			ps.setString(1, m.getId());
			ps.setString(2, m.getPwd());
			ps.setString(3, m.getName());
			ps.setString(4, m.getTel());
			ps.setString(5, m.getAddr());
			ps.setString(6, m.getBirth());
			ps.setString(7, m.getJob());
			ps.setString(8, m.getGender());
			ps.setString(9, m.getEmail());
			 r = ps.executeUpdate();	//실행 -> 저장
			
									
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
	//회원정보 수정
	public int memberUpdate(Member m) {
			Connection con = null;
			PreparedStatement ps = null;
			int r=0;
		try {
			String sql = "update member set pwd=?, name=?, tel=?, addr=?, birth=?, job=?,"
					+ "gender=?, email=? where id=?";
			con = DriverManager.getConnection(url, user, pwd);
			ps = con.prepareStatement(sql);
			
			ps.setString(1, m.getPwd());
			ps.setString(2, m.getName());
			ps.setString(3,  m.getTel());
			ps.setString(4, m.getAddr());
			ps.setString(5,  m.getBirth());
			ps.setString(6,  m.getJob());
			ps.setString(7, m.getGender());
			ps.setString(8,  m.getEmail());	
			ps.setString(9, m.getId());
			
			r = ps.executeUpdate();
					
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		return r;
	}
	
	//전체보기

	public ArrayList<Member> MemberView() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		ArrayList<Member> arr = new ArrayList<Member>();
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			String sql="select*from member order by id desc";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				Member m = new Member();
				m.setId(rs.getString("id"));
				m.setPwd(rs.getString("pwd"));
				m.setName(rs.getString("name"));
				m.setTel(rs.getString("tel"));
				m.setAddr(rs.getString("addr"));
				m.setBirth(rs.getString("birth"));
				m.setJob(rs.getString("job"));
				m.setGender(rs.getString("gender"));
				m.setEmail(rs.getString("email"));
				arr.add(m);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return arr;
		
		
	}
	
	//회원정보 삭제
	public void memberDelete(String id, String pwd) {
		Connection con = null;
		Statement st = null;
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			String sql="delete from member where id=? and pwd=?";
			st = con.createStatement();
			st.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	
	//DB데이터 다시 불러오기
	public void memberSelectAll(DefaultTableModel model) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, pwd);
			String sql="select * from member ";
			st = con.createStatement();
			rs = st.executeQuery(sql);
		
			//DefaultTableModel에 있는 데이터 지우기
			for(int i =0; i<model.getRowCount();) {
				model.removeRow(0);
			}
			while(rs.next()) {
				Object data[]= {rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6),
						rs.getString(7), rs.getString(8), rs.getString(9)};
									
						model.addRow(data);
				}
		}catch (SQLException e) {
				e.printStackTrace();
			}
		}




	@Override
	public void memberDelete(int num) {
		// TODO Auto-generated method stub
		
	}
}










