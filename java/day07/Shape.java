package day07;

public  abstract class Shape {
	private int x;
	private int y;
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void print() {
		System.out.println("ÁÂÇ¥(x,y)=("+x +","+y+")");
	}
	public  abstract double getArea() ;
	

}
