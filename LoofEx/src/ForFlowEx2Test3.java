import java.util.Scanner;

public class ForFlowEx2Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("홀짝게임 시작!");
		
		
		for(int i = 1 ; i <= 3; i++) {
		System.out.println("숫자를 입력하세요");
		num = scan.nextInt();

		
	if (num%2 == 0) {
		System.out.println("값이" + num + "일 경우, 짝수");
	}else if (num%2 == 1) {
		System.out.println("값이" + num + "일 경우, 홀수");
	}else if (num == 0) {
		System.out.println("값이" + num + "일 경우, 짝수");

	}
	}
}}
