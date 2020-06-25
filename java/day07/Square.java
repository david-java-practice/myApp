package day07;

public  class Square  extends Shape{
	private int width, height;
	public Square(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	//오버라이딩
	public void print() {
		super.print();
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
	}
	//오버라이딩
	public double getArea() {
		return width*height;
	}
	
		

}




