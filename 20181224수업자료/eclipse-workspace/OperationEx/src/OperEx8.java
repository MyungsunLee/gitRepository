
public class OperEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//소수점 내림처리
		double pi = 0.0;
		double shortPi = 0.0;
		double roundPi = 0.0;
		
		pi = 3.141592;
		shortPi = (int)(pi * 1000) / 1000.0;
		
		System.out.println("소수점 3째자리까지 반올림 표현 : " + shortPi);
		System.out.println();
		//반올림처리
		
		roundPi = (int)(pi * 1000+0.5);
		
		System.out.println(roundPi);
		System.out.println();
		
		roundPi = roundPi / 1000.0;
		
		System.out.println("소수점 4째자리에서 반올림 표현 : " + roundPi); //

	}

}
