
public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 0;
		
		x = 34;
		
		if (x == 0) {
				System.out.println("\"처음 방문해주셔서 감사합니다\"");
//				System.out.println("방문횟수는 1회 입니다");
		}
		
		if (x > 0) {
				System.out.println("다시 방문해주셔서 감사합니다");
//				System.out.println("방문 횟수는" + (x + 1) + "회 입니다");
		}
		System.out.println("방문 횟수는 " + (++x) + "입니다");
		
	}
	

}
