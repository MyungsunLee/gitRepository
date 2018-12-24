
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		 논리형 boolean: false, true
//		 문자형 char: 0~65535
//		 정수형 byte, short, int, long
//		 byte: -128~128
//		 short: -32,768 ~32,767(2^15)-1까지
//		 int: -2의 32승 ~ 반대 까지 약 +-200억(2^31=2,147,483,648)
//		 long: -2의 63승 ~ 반대 까지
//
//		 //		  실수형 float, double
//		 float: 1.4E-45 ~ 3.4E38
//		 double: 엄청 크다(long보다 큼)
		
		
//		boolean
//		기본값 : false
		boolean power = true;
		boolean checked = false;
		
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		
//		char
		
		char ch = 97;
//		하나의 문자만을 저장, 숫자는 아스키코드로 인해 출력가능..? Dec) 65=A
		
		System.out.println(ch);
		
		
		
//		인코딩 디코딩
		
//		정수형
//		byte, short, int, long
//		(byte : 1,  2,  4, 8byte)
//		(bit  : 8, 16, 32, 64bit)
		
		int num = -300000000;
		
		System.out.println(num);
		byte b = 127;
				
		
		b = (byte)(b + 1);
		
		System.out.println(b);
		
		long bigNum = 3000000000L;
		Long bigNum2 = 300000000034L;
		System.out.println("long 타입: " + bigNum);
		
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		int sum = 0;
		sum = firstNum + secondNum;
		System.out.println("총 명품금액: " + sum);
		
		
		
//		실수형
//		float, double
//		4byte, 8byte
//		실수 정확도 -> 정밀도
		
		float f = 9.1234567890123456789f;
		float f2 = 1.2345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
	}
}
