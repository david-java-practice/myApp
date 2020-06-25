package day07;

public class ShapeManager {
	Shape[] arr = new Shape[50];
	int cnt;
	public void inputData(int num) {//��->x, y, r  �簢��->x, y, h, w
		System.out.println("�����Է�.....");
		System.out.print("x��ǥ>>");
		int x = ShapeMain.sc.nextInt();
		System.out.print("y��ǥ>>");
		int y = ShapeMain.sc.nextInt();
		if(num==1) { //��
			System.out.print("������>>");
			int r = ShapeMain.sc.nextInt();
			arr[cnt++]= new Circle(x,y,r);
			
		}else if(num==2) {  //�簢��
			System.out.print("�ʺ�>>");
			int w = ShapeMain.sc.nextInt();
			System.out.print("����>>");
			int h = ShapeMain.sc.nextInt();
			arr[cnt++] = new Square(x,y,w,h);
		}
	}
	public void viewData() {
		//Shape sh = new Shape(); �߻�Ŭ������ ������ų �� ����
		double sum = 0;
		for(Shape   s : arr) {
			if(s==null) break;
			sum +=s.getArea();
			s.print();
		}
		//��ü������ ������ �� :
		System.out.println("��ü ���� : " + sum);
		
	}

}
