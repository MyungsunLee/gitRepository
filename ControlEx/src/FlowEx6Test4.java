
public class FlowEx6Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		int add = 0;
		
		n = 2;
		add = 1;
		
		while (n < 10) {
			System.out.println(n + "��");
			
			while (add < 10) {
				System.out.println(n + "*" + add + " = " + (n * add));
				add++;
			}add = 1;
			n++;
			System.out.println();
		}
		

	}

}
