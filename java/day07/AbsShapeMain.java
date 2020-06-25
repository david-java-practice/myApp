package day07;

public class AbsShapeMain {
  public static void main(String[] args) {
	AbsCircle ac = new AbsCircle();
	ac.draw();
	ac.move();
	
	AbsShape as = new AbsSquare();
	as.draw();
	as.move();
	as.print();
	
	//AbsShape ah = new AbsShape();
	AbsShape ah = new AbsCircle();
	
  }
}
