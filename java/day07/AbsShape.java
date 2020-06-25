package day07;

public  abstract class AbsShape {
	//그리다
	public abstract void draw();
	//이동하다
	public abstract void move();
	
	public void print() {
		System.out.println("도형그리다");
	}

}
