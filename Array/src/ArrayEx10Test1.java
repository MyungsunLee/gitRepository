import java.util.Scanner;

public class ArrayEx10Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int answer = 0;
		int rndNum = 0;
		int[] arr = new int[5];

		int tmp = 0;

		for (int i = 0; i < arr.length; i++) {

			System.out.println("���ڸ� �Է��ϼ���");
			answer = scan.nextInt();
			arr[i] = answer;

		}
		for (int i = 0; i < arr.length; i++) {	//		��� ���̰� �ִ� ���̹Ƿ� for ������ ���ͼ� �ٽ�
			rndNum = (int) (Math.random() * 5);	//		����� ����ؾ� �������� ����
			tmp = arr[i];					//		arr[i] = tmp;��� �ϸ� arr[i]�� 0�� �����
			arr[i] = arr[rndNum];			//		�� tmp = arr[i]; ��� �ӽ������صα�!
			arr[rndNum] = tmp;

		}
		
		System.out.println("������ ����");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}