
public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = new int[5];

		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;

		System.out.println("������������ ����");

		int tmp = 0;
		boolean check = false;		//�ڸ��ٲ��� �߻��ߴ��� üũ�ϴ� ���
		int cnt = 0;
		for (int i = 0; i < scoreArr.length - 1; i++) { // -1�� �� ���� : 4�� �����ϸ� ������ �ϳ��� �ڵ����� ���ĵ�

			check = false;
			for (int n = 0; n < scoreArr.length - 1 - i; n++) { // i-1 : �޺κ�(i��)�� �̹� ������ ���ֱ⶧���� ���ܽ�Ű�� ��
				if (scoreArr[n] > scoreArr[n + 1]) {		//���� ���� ������ ���� �ٲ�
					tmp = scoreArr[n];
					scoreArr[n] = scoreArr[n + 1];
					scoreArr[n + 1] = tmp; 
					check = true;		//���� ����Ǿ����� �ڸ��� ����Ǿ����� ����?
				}
				//�� ������Ҵ���
				cnt++;
			}
			// ����ǥ�� ����? ���� �ǹ̷δ� (check == false)
			if (!check) {		//�ڸ��ٲ��� ������ �ݺ����� �����
				break;
			}
		}
		//���ĵ� ����� ���
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		System.out.println();
			System.out.println("�� ���� Ƚ���� " + cnt);
	}
}
//for (int m = 0; m < scoreArr.length; m++) {
//if (scoreArr[m]<scoreArr[m+1]) {
//	tmp = scoreArr[m];
//	scoreArr[m] = scoreArr[m+1];
//	scoreArr[m+1] = tmp;
//}
//}