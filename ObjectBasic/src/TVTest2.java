
public class TVTest2 {

	public static void main(String[] args) {
//		��� - ǥ����
//		Ŭ������ ������;				Ŭ������ ��ü�� �����ϱ� ���� ���������� ����
//		Ŭ���������� = new Ŭ������();	Ŭ������ ��ü�� ���� ��, ��ü�� �ּҸ� ���������� ����
		// Ŭ�������ϸ��� TV�� �̰͸� �� �� ����
					
		TV mytv = new TV();
		TV mstv = new TV();
		TV chtv = new TV();
//		Ŭ��������			�ν��Ͻ�
		mytv.channel = 13;		//�տ� ���� ������� �� ����
		mytv.power = true;

		mstv.channel = 13;
		mstv.power = true;

		mstv.channel = 4;
		mstv.power = false;

		System.out.println("mytv ����" + mytv.power);
		System.out.println("myTV�� ä�ΰ��� " + mytv.channel + "�Դϴ�");
		System.out.println();

		System.out.println("mstv ����" + mstv.power);
		System.out.println("msTV�� ä�ΰ��� " + mstv.channel + "�Դϴ�");
		System.out.println();

		System.out.println("chtv ����" + chtv.power);
		System.out.println("mstv�� ä�ΰ��� " + chtv.channel + "�Դϴ�");
	}

}