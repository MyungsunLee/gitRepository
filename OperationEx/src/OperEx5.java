
public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//			int n = 0;
//			n = -10 +2;
//			
//			System.out.println(n);
//			n = -n;
//			System.out.println(n);
			
			int num = 0;
			int secondNum = 0;
			num = 10;
			secondNum = 4;
			
			System.out.printf("%d + %d = %d\n", num, secondNum, num+secondNum);
			
			System.out.printf("%d - %d = %d\n", num, secondNum, num-secondNum);
			
			System.out.printf("%d * %d = %d\n", num, secondNum, num*secondNum);
			
			System.out.printf("%d / %d = %d\n", num, secondNum, num/secondNum); //int가 정수만 표기하게 만듦
			
			System.out.printf("%d / %f = %f\n", num, (float)secondNum, num/(float)secondNum);
			//float으로 변환, int보다 float이 크기 때문에 소수점 뒷자리까지 모두 나온듯?(float)
									
	}

}
