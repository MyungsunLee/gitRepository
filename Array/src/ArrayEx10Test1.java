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

			System.out.println("숫자를 입력하세요");
			answer = scan.nextInt();
			arr[i] = answer;

		}
		for (int i = 0; i < arr.length; i++) {	//		계속 섞이고 있는 중이므로 for 밖으로 나와서 다시
			rndNum = (int) (Math.random() * 5);	//		결과값 출력해야 고정값이 나옴
			tmp = arr[i];					//		arr[i] = tmp;라고 하면 arr[i]에 0이 저장됨
			arr[i] = arr[rndNum];			//		꼭 tmp = arr[i]; 라고 임시저장해두기!
			arr[rndNum] = tmp;

		}
		
		System.out.println("무작위 섞기");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
