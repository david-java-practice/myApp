package day07;

public class Child extends Father{
	public Child() {
		super();
		System.out.println("切縦 持失切");
	}
	public void childPrint() {
		System.out.println(super.str);
		System.out.println("child print五社球");
	}
	public void test() {
		System.out.println("test method");
	}

}
