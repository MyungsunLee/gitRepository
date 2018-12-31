import java.util.Scanner;

public class randomPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.random

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int priceNum = 0;
		priceNum = (int) (Math.random() * 3) + 1;

		System.out.println("경품 추첨을 시작합니다!");
		System.out.println("1에서 3까지 중 숫자를 선택해 주세요");
		num = scan.nextInt();

		while (num == priceNum) {
			System.out.println("축하드립니다!");
			if (priceNum == 1) {
				System.out.println("추첨 결과 비행기 상품에 당첨되셨습니다!");
			} else if (priceNum == 2) {
				System.out.println("추첨 결과 오다리 상품에 당첨되셨습니다!");
			}else if (priceNum == 3) {
				System.out.println("추첨 결과 각설탕 상품에 당첨되셨습니다!");
			}
			System.out.println("(제세공과금은 본인 부담 입니다)");
		}

	}

}
