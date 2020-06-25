package day07;

public class Main {

	public static void main(String[] args) {
		Father f1 = new Father();
		Child c1 = new Child();
		GrandFather g1 = new GrandFather(); //선언&생성
		c1.grandPrint();
		f1.grandPrint();
		
		GrandFather g2; //선언
		Father f2 = new Father();
		g2 = f2;   //GrandFather  =Father
		//f2 = g2; 컴파일 오류 발생
		// g2.fatherPrint();  //fatherPrint()는 Father 메소드
		//GrandFather 메소드가 출력 단, 오버라이드 된 메소드는 
		// 오버라이딩 된 메소드가 실행된다
		g2.grandPrint(); 
		
		GrandFather g3 = new Father();
		//  GrandFather g3
		//  Father f3 = new Father();
		// g3 = f3;
	}
 
}




