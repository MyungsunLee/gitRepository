import java.util.Scanner;

public class SwitchFlowEx1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int month = 0;

		System.out.println("Month �Է�");
		month = scan.nextInt();
		
		
		switch (month) {
		case 3 : case 4: case 5 : 
			System.out.println(month + "�� �� �Դϴ�");
			break;
		case 6 : case 7 : case 8 :
			System.out.println(month + "�� ���� �Դϴ�");
			break;
		case 9 : case 10 : case 11 :
			System.out.println(month + "�� ���� �Դϴ�");			
			break;
		case 12 : case 1 : case 2 :
			System.out.println(month + "�� �ܿ� �Դϴ�");
			break;
		default:
			System.out.println("�Է¿���");
			break;
		}
		
		
	}

}