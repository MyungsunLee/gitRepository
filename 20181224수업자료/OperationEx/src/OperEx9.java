import java.util.Scanner;

public class OperEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		�񱳿�����
//		>, <, <=, >=, ==, !=    ����� =>�� =<�� �ȵ�...=�� �տ� ������ �ȵ�
		System.out.println("���ڸ� �Է��� �ּ���");
		int num = scan.nextInt();
		
//		ũ��, ����, �ʰ�, �̸�   �տ� ���� ��������..
		System.out.println("2 > 1 ����� : "+ (2 > 1)); //true ���� ����� ������ boolean(true/false)������ ��µ�
		System.out.println(2 <= 2);
//		ũ�ų� ����, �۰ų� ����, �̻�, ����
		System.out.println(2 == 2);
//		==�� ���ٴ� �ǹ���.  1 == 2 : false
		System.out.println(2 != 0);
//		! = �ٸ���
		
	}

}
