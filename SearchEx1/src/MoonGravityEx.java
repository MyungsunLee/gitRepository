
public class MoonGravityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double weight = 0.0;
		
//		달에서의 중력은 1/6
//		자신의 몸무게를 구하는 공식weight / 6
		
		double moonWeight = 0.0;
		weight = 99;
		moonWeight = weight/6;
		moonWeight = (int)(moonWeight*100)/100.0;
		
		System.out.println("지구에서의 무게가 " + weight + "kg 일 때,");
		System.out.println("달에서의 몸무게는 " + moonWeight + "kg");
		
	}

}
