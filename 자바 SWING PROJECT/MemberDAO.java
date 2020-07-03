package swingProject;

import java.util.ArrayList;



public interface MemberDAO {
	
	//추가
	public int memberInsert(Member m);
	
	
	//수정
	public int memberUpdate(Member m);
	
	//삭제하기
	public void memberDelete(int num) ;
	
	
	
	

}
