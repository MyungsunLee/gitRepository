
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		Book book2 = new Book();

		book1.name = "���� �ݽ�";
		book1.price = 14800;

		book2.name = "����� ����";
		book2.price = 15900;

		System.out.println(book1.name + "�� " + book1.price + "�� �̴�");
		System.out.println(book2.name + "�� " + book2.price + "�� �̴�");
	}

}
