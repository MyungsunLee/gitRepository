import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
////		중첩 if문
//		if(조건식1) {
//			조건식 1의 연산결과가 true일 때 수행될 문장들을 적는다
//			if(조건식2) {
//				조건식 1과 조건식2가 모두 true일 때 수행될 문장들
//			}else{
//				조건식1이 true이고 조건식2가 false일 때 수행되는 문장들
//			}
//	}else {
//		조건식1이 false일 때 수행되는 문장들
//		}
		Scanner scan = new Scanner(System.in);
		
		
		int score = 0;
		String grade = "";				//문자열 초기화
		System.out.println("본인의 성적을 입력해주세요");
		score = scan.nextInt();
		

		

		if (score >=90) {  							//90 91 92 ~ 100
				grade = "A";
				if(score >= 98) { 					//98 99 100
					grade = "A+";
				}else if(score <94) {				//93 92 91 90
					grade = "A-";
				}
		}else if (score >= 80) {						//80 81 82 83 ~ 89
				grade = "B";						
				if(score >= 88) {					//88 89
					grade = "B+";
				}else if(score < 84) {				//83 82 81 80
						grade = "B-";	
				}
		}else {
			grade = "F";							
		}
		System.out.println( score + "의 학점은 " + grade + "입니다");		

	}
		
		
}
		
