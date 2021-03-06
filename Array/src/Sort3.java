
public class Sort3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scoreArr = new int[5];

		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;

		System.out.println("오름차순으로 정렬");

		int tmp = 0;
		boolean check = false;		//자리바꿈이 발생했는지 체크하는 기능
		int cnt = 0;
		for (int i = 0; i < scoreArr.length - 1; i++) { // -1을 한 이유 : 4번 정렬하면 마지막 하나는 자동으로 정렬됨

			check = false;
			for (int n = 0; n < scoreArr.length - 1 - i; n++) { // i-1 : 뒷부분(i뒤)는 이미 정렬이 되있기때문에 제외시키는 것
				if (scoreArr[n] > scoreArr[n + 1]) {		//옆의 값이 적으면 서로 바꿈
					tmp = scoreArr[n];
					scoreArr[n] = scoreArr[n + 1];
					scoreArr[n + 1] = tmp; 
					check = true;		//서로 변경되었으니 자리가 변경되었음을 설정?
				}
				//총 몇번돌았는지
				cnt++;
			}
			// 느낌표는 부정? 같은 의미로는 (check == false)
			if (!check) {		//자리바꿈이 없으면 반복문을 벗어난다
				break;
			}
		}
		//정렬된 결과를 출력
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
		System.out.println();
			System.out.println("총 돌은 횟수는 " + cnt);
	}
}
//for (int m = 0; m < scoreArr.length; m++) {
//if (scoreArr[m]<scoreArr[m+1]) {
//	tmp = scoreArr[m];
//	scoreArr[m] = scoreArr[m+1];
//	scoreArr[m+1] = tmp;
//}
//}