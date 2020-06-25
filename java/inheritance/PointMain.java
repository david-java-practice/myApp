package inheritance;

public class PointMain  extends Point{
	private String color;
	public PointMain(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void disp() {
		super.disp();
		System.out.println(" »ö±ò : " + color);
	}
	public static void main(String[] args) {
		PointMain pm = new PointMain(5,5,"Yellow");
		pm.disp();
		pm.move(10,20);
		pm.disp();
	}

}
