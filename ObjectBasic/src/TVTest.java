
public class TVTest {

	public static void main(String[] args) {
//		��� - ǥ����
//		Ŭ������ ������;				Ŭ������ ��ü�� �����ϱ� ���� ���������� ����
//		Ŭ���������� = new Ŭ������();	Ŭ������ ��ü�� ���� ��, ��ü�� �ּҸ� ���������� ����
		//Ŭ�������ϸ��� TV�� �̰͸� �� �� ����
		
		
		TV t;		
		t = new TV();
		
		
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä����" + t.channel + "�Դϴ�");

		t.color = "blue";
		System.out.println("����" + t.color);
	}

}