
public class ForDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		for(int i = 0; i <=5; i++) {

			for (int n = 5; n >=i ; n--) {
				System.out.print(" ");
			}
			
			for(int m = 0; m < i ; m++) {
				System.out.print("*");
				}	
				System.out.println();
			}	
	}
	}
