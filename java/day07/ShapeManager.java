package day07;

public class ShapeManager {
	Shape[] arr = new Shape[50];
	int cnt;
	public void inputData(int num) {//원->x, y, r  사각형->x, y, h, w
		System.out.println("도형입력.....");
		System.out.print("x좌표>>");
		int x = ShapeMain.sc.nextInt();
		System.out.print("y좌표>>");
		int y = ShapeMain.sc.nextInt();
		if(num==1) { //원
			System.out.print("반지름>>");
			int r = ShapeMain.sc.nextInt();
			arr[cnt++]= new Circle(x,y,r);
			
		}else if(num==2) {  //사각형
			System.out.print("너비>>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("높이>>");
			int h = ShapeMain.sc.nextInt();
			arr[cnt++] = new Square(x,y,w,h);
		}
	}
	public void viewData() {
		//Shape sh = new Shape(); 추상클래스는 생성시킬 수 없다
		double sum = 0;
		for(Shape   s : arr) {
			if(s==null) break;
			sum +=s.getArea();
			s.print();
		}
		//전체도형의 넓이의 합 :
		System.out.println("전체 넓이 : " + sum);
		
	}

}
