import java.util.Scanner;

public class FlowEx4Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ������ �Է����ּ���");
		int score = scan.nextInt();
		

		
		if (score >100) {
			System.out.println("�ùٸ� ������ �Է��� �ּ���");
		}else if (score >=90) {
				System.out.println(score + "���� A �Դϴ�");
		}else if(score >=80) {
			System.out.println(score + "���� B �Դϴ�");
		}else if(score >= 70) {
			System.out.println(score + "���� C �Դϴ�");
		}else {
			System.out.println(score + "���� F �Դϴ�");
		}

	}

}