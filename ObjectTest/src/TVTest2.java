
public class TVTest2 {

	public static void main(String[] args) {
//		��� - ǥ����
//		Ŭ������ ������;				Ŭ������ ��ü�� �����ϱ� ���� ���������� ����
//		Ŭ���������� = new Ŭ������();	Ŭ������ ��ü�� ���� ��, ��ü�� �ּҸ� ���������� ����
		// Ŭ�������ϸ��� TV�� �̰͸� �� �� ����

		TV t;
		t = new TV();

		t.channel = 0;

		System.out.println("channel " + t.channel);
		t.channel = 7;
		System.out.println("channel " + t.channel + " ���� ����Ǿ����ϴ�");
		t.channel = 14;
		System.out.println("channel " + t.channel + " ���� ����Ǿ����ϴ�");
		
		t.color = "û��";
		
		System.out.println(t.color);
		System.out.println(t.power);
	}

}