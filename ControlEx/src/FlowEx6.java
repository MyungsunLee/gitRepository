import java.util.Scanner;

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ٿ� ������ ������!
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int answer = 0;
		
		
		answer = (int)(Math.random() * 100) + 1;
		System.out.println( answer);
		while(true) {
			System.out.println("1�� 100 ������ ������ �Է��� �ּ���");
			input = scan.nextInt();
			
			if(input> answer) {
				System.out.println("�� ���� ���� �Է��� �ּ���");
			}else if (input<answer){
				System.out.println("�� ū ���� �Է��� �ּ���");
			}else {
				System.out.println("������ " + answer);
				System.out.println("��÷�Դϴ�!");
				break;
			}
		}System.out.println("��������");

}
}	