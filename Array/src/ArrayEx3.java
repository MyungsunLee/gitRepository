
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] numArr = new int[5];
		numArr[0] = 1;
		numArr[1] = 2;
		numArr[2] = 3;
		numArr[3] = 4;
		numArr[4] = 5;

		System.out.println(numArr.length);
		
		for (int i = 0; i < numArr.length; i++) {
			System.out.println((i + 1) + "번째 수행 : " + numArr[i]); //length는 고정값이 아닌 numArr이 변화함에 따라 유동적으로 맞춰줌
		}
		
		
		

}}
