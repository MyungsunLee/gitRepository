
public class ArrayEx5Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num5Arr = new int[5];
		int[] num10Arr = new int[10];
		
		num5Arr[0] = 2;
		num10Arr[0] = num5Arr[0];
		
		num5Arr[1] = 20;
		num10Arr[1] = num5Arr[1];

		num5Arr[2] = 12;
		num10Arr[2] = num5Arr[2];

		num5Arr[3] = 2;

		for (int i = 0; i < num5Arr.length; i++) {
			System.out.println("num5Arr [" + i + "]의 값 : " + num5Arr[i]);

		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.println("num10Arr[" + i + "]의 값    : " + num10Arr[i]);
		}
		for (int i = 4; i < num10Arr.length; i++) {
			num10Arr[i] = i;
			System.out.println("num10Arr[" + i + "]의 값    : " + num10Arr[i]);
		}
		
		System.out.println();

	}
}
