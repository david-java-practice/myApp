package test;
class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	public void show() {
		System.out.print(name +" "+ age +" ");
	}
}
class Student extends Person{
	String major;
	public Student(String name, int age,String major ) {
		super(name, age);
		this.major = major;
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.print(major);
	}
}

public class Test {
	int y;

	public static void main(String[] args) {
		Person  p = new Student("김자바", 25, "회사원");
		p.show(); // 김자바 25 회사원
		
		int x=0 ; //지역변수는 반드시 초기값설정
	//	System.out.println(x);
		Test t = new Test();
	//	System.out.println(t.y); //멤버변수가 int형이면 0으로 설정

	}

}
