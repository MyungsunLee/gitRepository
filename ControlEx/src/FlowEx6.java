import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//업다운 게임을 만들어보자!
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int answer = 0;
		
		
		answer = (int)(Math.random() * 100) + 1;
		System.out.println( answer);
		while(true) {
			System.out.println("1과 100 사이의 정수를 입력해 주세요");
			input = scan.nextInt();
			
			if(input> answer) {
				System.out.println("더 작은 수를 입력해 주세요");
			}else if (input<answer){
				System.out.println("더 큰 수를 입력해 주세요");
			}else {
				System.out.println("정답은 " + answer);
				System.out.println("당첨입니다!");
				break;
			}
		}System.out.println("게임종료");

}
}	
