import java.util.Scanner;

public class ForFlowEx2Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Ȧ¦���� ����!");
		
		
		for(int i = 1 ; i <= 3; i++) {
		System.out.println("���ڸ� �Է��ϼ���");
		num = scan.nextInt();

		
	if (num%2 == 0) {
		System.out.println("����" + num + "�� ���, ¦��");
	}else if (num%2 == 1) {
		System.out.println("����" + num + "�� ���, Ȧ��");
	}else if (num == 0) {
		System.out.println("����" + num + "�� ���, ¦��");

	}
	}
}}
