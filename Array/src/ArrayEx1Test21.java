
public class ArrayEx1Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] score = new int[6];
//		int i = 0;

//		while(i<6) {
//			score[i] = i * 10;
//			System.out.println(score[i]);
//			i++;
//		}
		int i = 0;
		for (i = 0; i < 6; i++) {
			score[i] = i * 10;
		}

		for (i = 0; i < 6; i++) {
			System.out.println(score[i]);	//꼭 분리시키기

		}

	}
}
