
public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if-else if-else��
		
//		ǥ����
//		if(���ǽ�) {
//			���ǽ��� true�� �� ����� ������� ���´�
//		}else{ if(���ǽ�2){
//			���ǽ�2�� �������� ���� �� ���� �� ������� ���´�
//		}else{ if(���ǽ�3){
//			���ǽ�3�� �������� ���� �� ����� ������� ���´�
//		}else{
//			���� ��� ���ǵ� �������� ���� �� ����� ������� ���´�
//		}
		
		int num = 0;
		num = 1;
		if(num == 0) {
				System.out.println("ó�� ���̱���. ������ ���޵Ǿ����ϴ�");
		}else if(num %5 ==0) {
				System.out.println(num + "��°�Դϴ�. �������� 1�� ���� �����մϴ�");
				System.out.println("��, 3800�� ���� ��ǰ�� �����մϴ�");
		}else if(num == 9) {
				System.out.println("������ ��� ����Ͽ����ϴ�");
		}else {
			System.out.println("���� ������ ���� : " + num);
		}
		
		
		
	}

}