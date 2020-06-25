package utilTest;

public class StringTest03 {

	public static void main(String[] args) {
		String tmp = "1 0 15 23 6 21 17 10 11 12 13 14";
		// tmp길이 
	   System.out.println("tmp길이 :" + tmp.length());
	   // tmp를 공백으로 구분하여 출력
	   String[] arr = tmp.split(" ");
	   System.out.println("arr길이 :" + arr.length);
	   for(int i =0; i<arr.length;i++) {
		   System.out.print(arr[i]+"\t");
	   }
	   System.out.println();
	   //16진수
	   System.out.println(Integer.toHexString(15));
	   //arr배열안에 있는 숫자를 16진수를 변경
	   String oct ="";
	   String hex="";
	   for(int i=0; i<arr.length;i++) {
		   int v = Integer.parseInt(arr[i]);
		   oct +=Integer.toOctalString(v).toUpperCase()+"\t";
		   hex +=Integer.toHexString(v).toUpperCase()+"\t";
	   }
	   //8진수
	   System.out.println("8진수 : " + oct);
	   //16진수
	   System.out.println("16진수 : " + hex);
		

	}
	
	
	
	
	

}
