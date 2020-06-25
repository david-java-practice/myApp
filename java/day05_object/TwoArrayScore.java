package day05_object;

import java.util.Scanner;

public class TwoArrayScore {
	static Scanner sc = new Scanner(System.in);
	int[][]  arr = new int[50][7];
	int row = 0;
	
	public  void showMenu() {
		System.out.println("선택하세요...");
		System.out.println("1. 데이터입력");
		System.out.println("2. 전체보기/종료");
		System.out.print("선택 >>");
	}
	public void inputData() {  //성적입력
		System.out.println("성적입력 시작 >>");
		System.out.print("학번 >>");
		int yearNum = sc.nextInt();
		System.out.print("국어 >>");
		int kor = sc.nextInt();
		System.out.print("영어 >>");
		int eng = sc.nextInt();
		System.out.print("수학 >>");
		int math = sc.nextInt();
		arr[row][0] = yearNum;  //학번 
		arr[row][1] = kor;             // 국어
		arr[row][2] = eng;             //영어
		arr[row][3] =math;           //수학
		arr[row][4] = kor+eng+math;  //총점
		arr[row][5] = arr[row][4]/3;  //평균
		arr[row][6] = 1;                 //석차
		row++;
	}
	public void rankMethod() {
		for(int i=0; i<row-1;i++) {
			for(int j=i+1   ; j<row ;j++) {
				if(arr[i][4] > arr[j][4]) {
					arr[j][6]++;
				}else {
					arr[i][6]++;
				}
			}//j
		}//i
	}
	public void viewData() {  //전체보기
		rankMethod();  //석차메소드
		System.out.println("-----성적 보기-----");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t순위");
	  //for(int i=0; i<row;i++){
		for(int i=0; i<arr.length;i++) {
			if(arr[i][0]==0) break;
			for(int j=0; j< arr[i].length;j++ ) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		TwoArrayScore manager =new TwoArrayScore(); 
		while(true) {
			manager.showMenu(); //메뉴보여주기
			int num = sc.nextInt() ; //메뉴 선택
			switch(num) {
			case 1 : manager.inputData(); break;   //성적입력
			case 2:  manager.viewData();
			                System.exit(0);//전체보기/ 종료
			default : System.out.println("입력오류");
			}
		}

	}

}
