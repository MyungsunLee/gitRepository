
public class MoonGravityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double weight = 0.0;
		
//		�޿����� �߷��� 1/6
//		�ڽ��� �����Ը� ���ϴ� ����weight / 6
		
		double moonWeight = 0.0;
		weight = 99;
		moonWeight = weight/6;
		moonWeight = (int)(moonWeight*100)/100.0;
		
		System.out.println("���������� ���԰� " + weight + "kg �� ��,");
		System.out.println("�޿����� �����Դ� " + moonWeight + "kg");
		
	}

}