
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// ���赵�� ������ ����� ��
	
	Time koreaTime = new Time ();
	
	koreaTime.hour = 5;
	Time americanTime = new Time();
	
	koreaTime.hour = 5;
	koreaTime.minute = 26;
	koreaTime.second = 31;
	
	
	americanTime.hour = 3;
	americanTime.minute = 26;
	americanTime.second = 31;
	
	System.out.println("�ѱ��ð� : �� " + koreaTime.hour + "��" + koreaTime.minute + "��"+ koreaTime.second) ;
	}
//	System.out.println("�̱��ð� : �� " + americaTime.hour + "��" + americaTime.minute + "�� "+ americaTime.second);
}

}