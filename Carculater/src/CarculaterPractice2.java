import java.util.Scanner;

public class CarculaterPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int num2 = 0;
		String rule = " ";

		System.out.println("����ver1.0");
		System.out.println("���ڸ� �Է��� �ּ���");
		num = scan.nextInt();

		System.out.println("+,-,*,/ ");
		rule = scan.nextLine();
		rule = scan.nextLine();

		System.out.println("���ڸ� �Է��� �ּ���");
		num2 = scan.nextInt();
		
		if (rule == "+") {
			System.out.println(num + num2);
		} else if (rule == "-"){
			System.out.println(num - num2);
		} else if(rule == "*") {
			System.out.println(num * num2);
		} else if (rule == "/") {
			System.out.println(num/num2);
		}System.out.println("��� ����");

}}