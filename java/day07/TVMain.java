package day07;
//32인치 1024컬러
//나의  IPTV는 192.1.1.2 주소의 32인치 2048컬러
public class TVMain {
	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty(); 
	
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
	}

}
