
public class Sort3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 내림차순으로 정렬. 10-2
		int[] Arr = { 5, 8, 2, 10, 7 };

		int tmp = 0;

		for (int i = 0; i < Arr.length - 1; i++) {
			for (int n = 0; n < Arr.length - 1 - i; n++) {

				if (Arr[n] < Arr[n + 1]) {
					tmp = Arr[n+1];
					Arr[n+1] = Arr[n];
					Arr[n] = tmp;
				}
			}
		}

		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}
	}
}