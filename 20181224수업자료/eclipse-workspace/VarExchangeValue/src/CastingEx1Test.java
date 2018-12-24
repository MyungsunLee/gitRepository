
public class CastingEx1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double doubleNum = 54.853;
		int n = 0;
		n = (int)doubleNum;
		
		System.out.println(n);
		System.out.println();
		
		doubleNum = (int)doubleNum;
		
		System.out.println("n : " + n);
		System.out.println("doubleNum : " + doubleNum);
	}

}
