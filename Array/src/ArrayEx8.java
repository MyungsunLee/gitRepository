import sun.security.util.Length;

public class ArrayEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int max = 0;
		int min = 0;
		
		int [] scoreArr = {
				79, 88, 91, 33, 100, 55, 95
		};
		
		max = scoreArr[0];			//�Ŀ� ��� ���ϰ� �Ϸ��� ������ �� ������
		min = scoreArr[0];

		for (int i = 0; i<scoreArr.length; i++) {
			if(scoreArr[i]>max) {
				max = scoreArr[i];
			}else if(scoreArr[i]<min) {
				min = scoreArr[i];
			
		}}}}
		
//		for(int i = 0;scoreArr[i])
//			
//		
//		System.out.println("�ִ� : " + max);
//		System.out.println("�ּҰ� : " + min);
	
//		if(scoreArr[i] < min) 
//		min = scoreArr[i];
//		if(scoreArr[i] > max) {
//			max = scoreArr[i];
	

		
