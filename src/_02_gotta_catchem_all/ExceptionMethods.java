package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double a, double b) {
		if (b==0.0) {
	throw new IllegalArgumentException();
		}
		else {
		return a/b;
		}
	}
	public String reverseString(String a) {
		if(a.length()==0) {
			throw new IllegalStateException();
		}
		else {
			String b = "";
			for (int i = a.length()-1; i < 0; i++) {
				b = b+a.charAt(i);
			}
			return b;
		}
	}
}
