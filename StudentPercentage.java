
public class StudentPercentage {

	public static int marks1=78;
	public static int marks2=85;
	public static int marks3=90;
	public static int total() {
		return marks1+marks2+marks3;
	}
	public static void percentage() {
		int total_marks=total();
		double percent=(total_marks/300.0)*100;
		System.out.println(percent);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		percentage();
		

	}

}
