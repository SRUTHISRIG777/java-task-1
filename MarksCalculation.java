
public class MarksCalculation {

	public static int sub1=85;
	public static int sub2=90;
	public static int sub3=80;
	public static int totalMarks() {
		return sub1+sub2+sub3;
	  
	}
	public static double averageMarks() {
		double avg=totalMarks();
		return avg/3;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalMarks());
		System.out.println(averageMarks());
		

	}

}
