package inheritance;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y =y;
	}
	public void disp() {
		System.out.print("Á¡(x,y) = ("+x +","+y+")");
	}
	public void move(int x, int y) {
		this.x = x;
		this.y =y;
	}


}
