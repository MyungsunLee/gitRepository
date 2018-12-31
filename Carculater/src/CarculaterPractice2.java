import java.util.Scanner;

public class CarculaterPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num = 0;
		int num2 = 0;
		String rule = " ";

		System.out.println("계산기ver1.0");
		System.out.println("숫자를 입력해 주세요");
		num = scan.nextInt();

		System.out.println("+,-,*,/ ");
		rule = scan.nextLine();
		rule = scan.nextLine();

		System.out.println("숫자를 입력해 주세요");
		num2 = scan.nextInt();
		
		if (rule == "+") {
			System.out.println(num + num2);
		} else if (rule == "-"){
			System.out.println(num - num2);
		} else if(rule == "*") {
			System.out.println(num * num2);
		} else if (rule == "/") {
			System.out.println(num/num2);
		}System.out.println("계산 종료");

}}