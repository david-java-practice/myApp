package interfaceTest;

public class Circle  implements Shape{
	private int r;
	public Circle(int r) {
		this.r = r;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}

	@Override
	public double circum() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

}
