
public class TriangleOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		삼항연산자
//		표현식
//		(조건식) ? 식1 : 식2
//		ex: 변수 = (조건식) ? 식1 : 식2
		int x = 0;
		int y = -10;
		
		x = 10;
		y = -10;
//		absolute/ 비교연산은 true false값만 있을뿐 계산결과?가 나오는 건 아님
		int absX = (x >= 0) ? x : -x;  //x>=가 맞으면 absX = x
		int absY = (y >= 0) ? y : -y;  //y>=가 맞지 않음 -> absY = -y  ===>()안이 맞으면 앞에거, 틀리면 뒤에거
		
		System.out.println("x = 10일 때, x의 절대값은 " + absX);
		System.out.println("y = -10일 때, y의 절대값은 " + absY);
		
		
		
		
		
		
	}

}
