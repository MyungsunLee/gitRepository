
public class SwitchFlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		switch
//		ǥ����
//		switch (���ǽ�) {
//		case�� 1:
//				���ǽ��� ����� ��1�� ���� ��� ����� �����
//			break;
//		case �� 2:
//				���ǽ��� ����� ��2�� ���� ��� ����� �����
//			break;
//		default:
//			���ǽ��� ����� ��ġ�ϴ� case���� ���� �� ����� �����
//			break;
//		}

		int score = 0;
		
		score = (int)(Math.random()* 10) + 1;
		
		switch (score * 100) {
		case 100:
			System.out.println("����� ������" + (score * 100) + "�̰�, ��ǰ�� ������ �Դϴ�");
			break;
		case 200:
			System.out.println("����� ������ " + (score * 100) + "�̰�, ��ǰ�� TV �Դϴ�");
			break;
		case 300:
			System.out.println("����� ������" + (score* 100) + "�̰�, ��ǰ�� ��Ʈ�� �Դϴ�");
			break;
		default:
			System.out.println("�˼������� " + (score * 100) + "���� ��ǰ�� �����ϴ�");
			break;
		}

	
	}
		
		
}
		