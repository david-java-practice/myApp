package interfaceTest;

public class Won2Dollar  extends Converter{
   public Won2Dollar(int don) {
	   super.ratio = don;
   }

@Override
double convert(double src) {
	return src/ratio;
}

@Override
String srcString() {
		return "¿ø";
}

@Override
String destString() {
	// TODO Auto-generated method stub
	return "´Þ·¯";
}

}
