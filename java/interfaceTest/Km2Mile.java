package interfaceTest;

public class Km2Mile  extends Converter{
	public Km2Mile(double ratio) {
		super.ratio = ratio;
		
	}

	@Override
	double convert(double src) {
		// TODO Auto-generated method stub
		return src/ratio;
	}

	@Override
	String srcString() {
		// TODO Auto-generated method stub
		return "Km";
	}

	@Override
	String destString() {
		// TODO Auto-generated method stub
		return "mile";
	}

}
