import java.util.Scanner;

public class randomPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.random

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int priceNum = 0;
		priceNum = (int) (Math.random() * 3) + 1;

		System.out.println("��ǰ ��÷�� �����մϴ�!");
		System.out.println("1���� 3���� �� ���ڸ� ������ �ּ���");
		num = scan.nextInt();

		while (num == priceNum) {
			System.out.println("���ϵ帳�ϴ�!");
			if (priceNum == 1) {
				System.out.println("��÷ ��� ����� ��ǰ�� ��÷�Ǽ̽��ϴ�!");
			} else if (priceNum == 2) {
				System.out.println("��÷ ��� ���ٸ� ��ǰ�� ��÷�Ǽ̽��ϴ�!");
			}else if (priceNum == 3) {
				System.out.println("��÷ ��� ������ ��ǰ�� ��÷�Ǽ̽��ϴ�!");
			}
			System.out.println("(������������ ���� �δ� �Դϴ�)");
		}

	}

}
