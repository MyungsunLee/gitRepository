
public class ArrayEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2���� �迭
//		int�� Ÿ�� 4�� 3���� 2���� �迭�� �����Ѵ�
		int[][] scoreArr = new int[4][3];
		
		scoreArr[0][0] = 1;
		scoreArr[3][2] = 12;
		
//		System.out.println(scoreArr[0][0]);
//		System.out.println(scoreArr[1][1]);
//		System.out.println(scoreArr[3][2]);
		
		for (int i = 0; i < 4; i++) { //4��
			for (int n = 0; n < 3; n++) {	//3��
				System.out.print(" [" + scoreArr[i][n] + "] ");
			}System.out.println();
		}
		
	
	}

}