package day05_object;

public class CircleBeanMain {

	public static void main(String[] args) {
		//반지름이 1, 2, 3, 4, 5 인 5개의 CircleBean  객체를 만들고
		// 각 CircleBean 의 넓이를 출력하고
		// 총 면적을 출력하시오
		/*
		CircleBean c1 = new CircleBean(1);
		CircleBean c2 = new CircleBean(2);
		CircleBean c3 = new CircleBean(3);
		CircleBean c4 = new CircleBean(4);
		CircleBean c5 = new CircleBean(5);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		System.out.println(c3.getArea());
		System.out.println(c4.getArea());
		System.out.println(c5.getArea());
		double sum= c1.getArea()+c2.getArea()+
				c3.getArea()+c4.getArea()+c5.getArea();
		
		System.out.println(sum);
		
		*/
		//배열은 선언, 생성, 초기화
		CircleBean[] arr = new CircleBean[10];  //선언&생성
	   for(int i=0; i<arr.length;i++) {
		   arr[i] = new CircleBean(i+1); //초기화
	   }
	   double hap =0;
	   for(int i=0; i<arr.length;i++) {
		   System.out.println(arr[i].getArea());
		   hap += arr[i].getArea();
	   }
	   System.out.println("총면적 : " + hap);
	 

	}

}





