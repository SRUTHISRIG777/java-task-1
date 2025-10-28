
public class CurrencyConverter {

	public static double dollarRate=84.5;
	public static void convertToINR(double usd) {
		double inr=usd*dollarRate;
		System.out.println(inr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertToINR(1);
		convertToINR(5);
		convertToINR(10);
		

	}

}
