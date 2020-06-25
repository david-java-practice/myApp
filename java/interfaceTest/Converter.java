package interfaceTest;

import java.util.Scanner;

public abstract class Converter {
	abstract  double convert(double src);
	abstract String srcString();
	abstract String destString();
	protected double ratio;
	
	Scanner scanner = new Scanner(System.in);
	public void run() { // 교환
		System.out.println(srcString()+"을 "+destString()+"로 바꿉니다.");
		System.out.print(srcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과:"+res+destString()+"입니다");
	}

}
