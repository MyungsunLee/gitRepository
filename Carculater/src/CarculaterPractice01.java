import java.util.Scanner;

public class CarculaterPractice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		double num = 0;
		double num2 = 0;
		String rule = " ";

		System.out.println("����ver1.0");
		System.out.println("���ڸ� �Է��� �ּ���");
		num = scan.nextInt();

		System.out.println("+,-,*,/ ");
		rule = scan.nextLine();
		rule = scan.nextLine();

		System.out.println("���ڸ� �Է��� �ּ���");
		num2 = scan.nextInt();

		switch (rule) {

		case "+":
			System.out.println(num + num2);
			break;
		case "-":
			System.out.println(num - num2);
			break;
		case "*":
			System.out.println(num * num2);
			break;
		case "/":
			System.out.println(num / num2);
			break;

		}
		
		System.out.println("��� ����");
	}

}
