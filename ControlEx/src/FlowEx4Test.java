import java.util.Scanner;

public class FlowEx4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("본인의 성적을 입력해주세요");
		int score = scan.nextInt();
		

		
		if (score >100) {
			System.out.println("올바른 점수를 입력해 주세요");
		}else if (score >=90) {
				System.out.println(score + "점은 A 입니다");
		}else if(score >=80) {
			System.out.println(score + "점은 B 입니다");
		}else if(score >= 70) {
			System.out.println(score + "점은 C 입니다");
		}else {
			System.out.println(score + "점은 F 입니다");
		}

	}

}
