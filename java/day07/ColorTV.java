package day07;

public class ColorTV extends TV {
	private int nColors;
	public ColorTV(int inch, int nColors) {
		super(inch);
		this.nColors = nColors;
	}
    public void printProperty() {
    	System.out.println( inch +"인치 " + nColors +"컬러");
    }
}
