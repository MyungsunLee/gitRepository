
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ave = 0.0;
		int sum = 0;
		int[] scoreArr = { 100, 88, 100, 100, 90, 87, 86, 12 };

		
//		sum 0 1 2 3 4
		for(int i = 0; i <scoreArr.length ; i++) {
			sum = sum + scoreArr[i];
		}		
		
		System.out.println("���� : " + sum);
//		�Ҽ��� 3�ڸ����� ����
		
		ave = (double) sum/scoreArr.length;
		ave = (int)(ave*100)/100.0;
		
		System.out.println("��� : " + ave);
	
	
	
	
	
	
	
	}

}