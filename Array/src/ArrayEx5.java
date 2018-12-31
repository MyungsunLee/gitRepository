
public class ArrayEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = new int[5]; // 0 1 2 3 4
		int[] backUpNumArr = new int[5]; // 0 1 2 3 4

		System.out.println("=====================");
		numArr[0] = 10;
		backUpNumArr[0] = numArr[0];
		
		for(int i = 0; i < numArr.length; i++) {
			System.out.println("원본데이터 : " + numArr[i]);
		}
		for(int i = 0; i < backUpNumArr.length; i++) {
			System.out.println("원본데이터 : " + backUpNumArr[i]);
		}
		
		
	}
	

}
