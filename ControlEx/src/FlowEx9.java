import java.util.Scanner;

public class FlowEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		String str = "";
		
		
		
		int n=0;
		
		while(n < 3) {
			System.out.println("내용을 입력해 주세요");
			System.out.println("종료를 하시려면 -999를 입력해 주세요");
			str = scan.nextLine();

			System.out.println(str);
			n++;
			
			
		}System.out.println("프로그램을 종료합니다");
		
		
		
}
}	
