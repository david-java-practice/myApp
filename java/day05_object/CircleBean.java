package day05_object;

public class CircleBean {
	int r; //¹ÝÁö¸§
	final  double PI = 3.14;
	public CircleBean(int r) {
		this.r = r;
	}
	public double getArea() {
		return r*r*PI;
	}

}
