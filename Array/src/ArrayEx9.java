
public class ArrayEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// �� ��ȣ 45�� �������
		int[] ballArr = new int[45];
		// 1~45�� ���夷
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = i+1;
			System.out.print(ballArr[i]);

		}
//		45�� �� Ȯ��. ��� �� 5������� �����Է�
//		for (int i = 0; i < ballArr.length; i++) {
//			System.out.print(ballArr[i] + " ");
//			if((i + 1)%5 == 0) {				//i+1�̾�� �ùٸ� ����. i�� �����̶� ���� �ζǰ�-1��
//				System.out.println();
//			}
//		}
		
		int tmp = 0;				//���� �����.tmp = �ӽ��������
		int rndNum = 0;
//		���´�
		for (int i = 0; i < 6; i++) {
			rndNum = (int)(Math.random()*45);
			tmp = ballArr[i];			
			ballArr[i] = ballArr[rndNum];
			ballArr[rndNum] = tmp;		//���ش� ��µ�....������ �迭 �� rndNum��° ���ڸ� i(1~6)�� �̴°�
		}
		System.out.println("�ڵ����ù�ȣ");
		System.out.println("============");
		for (int i = 0; i < 6; i++) {
			System.out.print(ballArr[i] + " ");
//			
		}
		
		
		
		
		
		
		
	
	}

}