import java.util.Scanner;

public class BmiCarculatingEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		double weight = 0.0;
		double high = 0.0;
		double bmi = 0;

		System.out.println("�����Ը� �Է��� �ּ���");
		weight = scan.nextInt();

		System.out.println("Ű�� �Է��� �ּ���");
		high = scan.nextInt();

		bmi = (int) ((weight / (high/100*high/100))*10)/10.0;

		if (bmi < 19) {
			System.out.println("bmi : " + bmi);
			System.out.println("�˻��� ��ü�� �Դϴ�");
		} else if (bmi < 25) {
			System.out.println("bmi : " + bmi);
			System.out.println("�˻��� ����ü�� �Դϴ�");
		} else if (bmi > 25) {
			System.out.println("bmi : " + bmi);
			System.out.println("�˻��� ��ü�� �Դϴ�");
		}
	}

}