
public class ArrayEx51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		복사
		int[] numArr = new int[5];	//0 1 2 3 4
		int[] backUpNumArr = new int[5];	//0 1 2 3 4

		numArr[0] = 10;
		backUpNumArr[0] = numArr[0]; 
		
//							0 1 2 3 4 개
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본 데이터: " + numArr[i]);
		}

		System.out.println("======================================");
		for (int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("백업 데이터: " + backUpNumArr[i]);
		}

		numArr[0] = 30;
		backUpNumArr[1] = 40;

		System.out.println("원본 수정 후======================================");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("원본 데이터: " + numArr[i]);
		}

		System.out.println("======================================");
		for (int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("백업 데이터: " + backUpNumArr[i]);
		}

	}

}
