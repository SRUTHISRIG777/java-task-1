
public class MethodChaining {
	public static int a=20;
	public static int b=30;
	public static int Sum(int a,int b) {
		return a+b;
	}
	public static void average(int c,int d) {
		int sum=Sum(c,d);
		int avg=sum/2;
		System.out.println(avg);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		average(20,30);

	}

}
