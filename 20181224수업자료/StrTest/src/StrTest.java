
public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//문자열 : 어떤 다른 내용과 합쳐져도 영향을 주지 않아야 한다
		String str = "";
		String name = "";
		//문자형 - 한 글자만 적을 수 있음 스페이스바 한번은 인식x, 스페이스바2번으로 인식
		char ch = ' ';
		
		str = "오" + " " + "신" + "기" + "하" + "다";
		name = str + 8.0;
		
		//문자열 특징
//		문자열 + any type -> 문자열 + 문자열 -> 문자열
//		any type + 문자열 -> 문자열 + 문자열 -> 문자열
		System.out.println("str : " + str);
		System.out.println("name : " + name);
		System.out.println();
		
		String string = "";
		string = 7 + "";
		
		
//		concat
		System.out.println(7 + 7 + " ");
		System.out.println(" " + 7 + 7);
	}

}
