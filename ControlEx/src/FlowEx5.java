import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
////		��ø if��
//		if(���ǽ�1) {
//			���ǽ� 1�� �������� true�� �� ����� ������� ���´�
//			if(���ǽ�2) {
//				���ǽ� 1�� ���ǽ�2�� ��� true�� �� ����� �����
//			}else{
//				���ǽ�1�� true�̰� ���ǽ�2�� false�� �� ����Ǵ� �����
//			}
//	}else {
//		���ǽ�1�� false�� �� ����Ǵ� �����
//		}
		Scanner scan = new Scanner(System.in);
		
		
		int score = 0;
		String grade = "";				//���ڿ� �ʱ�ȭ
		System.out.println("������ ������ �Է����ּ���");
		score = scan.nextInt();
		

		

		if (score >=90) {  							//90 91 92 ~ 100
				grade = "A";
				if(score >= 98) { 					//98 99 100
					grade = "A+";
				}else if(score <94) {				//93 92 91 90
					grade = "A-";
				}
		}else if (score >= 80) {						//80 81 82 83 ~ 89
				grade = "B";						
				if(score >= 88) {					//88 89
					grade = "B+";
				}else if(score < 84) {				//83 82 81 80
						grade = "B-";	
				}
		}else {
			grade = "F";							
		}
		System.out.println( score + "�� ������ " + grade + "�Դϴ�");		

	}
		
		
}
		