
public class OperEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		단항연산자(--) : 피연산자의 값을 1 감소시킨다
//		증감영산자(++) : 피연산자의 값을 1 증가시킨다
		
		int i = 5;
//		i++;  //++ : +1, 즉 i(5) + 1     ++을 뒤에 붙임 : 후위형
		
		System.out.println(i++);
		
		i = 5;
		++i;  //++ : 1, 즉 1 + i(5)      ++을 앞에 붙임 : 전위형
		
		System.out.println(i);
		
		System.out.println(i++);

		
	}

}
