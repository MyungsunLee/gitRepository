
public class FlowEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if-else if-else문
		
//		표현식
//		if(조건식) {
//			조건식이 true일 때 수행될 문장들을 적는다
//		}else{ if(조건식2){
//			조건식2의 연산결과가 참일 때 수행 될 문장들을 적는다
//		}else{ if(조건식3){
//			조건식3의 연산결과가 참일 때 수행될 문장들을 적는다
//		}else{
//			위의 어느 조건도 만족하지 않을 때 수행될 문장들을 적는다
//		}
		
		int num = 0;
		num = 1;
		if(num == 0) {
				System.out.println("처음 오셨군요. 쿠폰이 지급되었습니다");
		}else if(num %5 ==0) {
				System.out.println(num + "번째입니다. 무료음료 1잔 선택 가능합니다");
				System.out.println("단, 3800원 이하 제품만 가능합니다");
		}else if(num == 9) {
				System.out.println("쿠폰을 모두 사용하였습니다");
		}else {
			System.out.println("현재 쿠폰의 개수 : " + num);
		}
		
		
		
	}

}
