
public class OneToOneHundred2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int sum = 0;

		
		for (int num = 0;num < 100 ; num++ ) {
			
			if (sum + (num + 1) >100) {
				System.out.println("계산을 종료합니다");
				break;
			}
			sum = sum + num + 1;
			System.out.println(num + "번째 : " + sum);
			
			
			}


		}
		
		
		
	}


