
public class ArrayEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50},
		};
		
		for (int i = 0; i < 5; i++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("[" + score[i][n] + "] ");
			}System.out.println();
		}
	}

}
