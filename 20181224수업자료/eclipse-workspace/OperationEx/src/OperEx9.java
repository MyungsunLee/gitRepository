import java.util.Scanner;

public class OperEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		비교연산자
//		>, <, <=, >=, ==, !=    절대로 =>나 =<는 안됨...=이 앞에 나오면 안됨
		System.out.println("숫자를 입력해 주세요");
		int num = scan.nextInt();
		
//		크다, 적다, 초과, 미만   앞에 수를 기준으로..
		System.out.println("2 > 1 결과는 : "+ (2 > 1)); //true 비교의 결과는 무조건 boolean(true/false)값으로 출력됨
		System.out.println(2 <= 2);
//		크거나 같다, 작거나 같다, 이상, 이하
		System.out.println(2 == 2);
//		==이 같다는 의미임.  1 == 2 : false
		System.out.println(2 != 0);
//		! = 다르다
		
	}

}
