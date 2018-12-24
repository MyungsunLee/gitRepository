
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자동변환
		//자동 형변환의 규칙
//		기존의 값을 최대한 보존할 수 잇는 타입으로 자동 형변환한다
//		1        2        4       8       16       32
//		byte -> short -> int -> long -> float -> double
//				char-> 
		/* 묵시적 형변환
		 * 명시적 형변환 값의 손실이 있지만 그 결과가 원하는 결과라고 compiler에게 알려준다 
		 */
		
		/*1. boolean(true/false)을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
		 *2. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
		 *	 값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다
		*/
		double doubleNumb = 0.0;
		//int num = 0.1;
		doubleNumb = 10;
		
		long bigNum = 528184421;
		
		long bigNum2 = 285346346363L;
		System.out.println(bigNum2);
		System.out.println(doubleNumb);
		
		double someNumber = 54.626;
		someNumber = (int)someNumber;
		
		System.out.println(someNumber);
		
		
	}

}
