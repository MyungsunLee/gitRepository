
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		Book book2 = new Book();

		book1.name = "몬스터 콜스";
		book1.price = 14800;

		book2.name = "경애의 마음";
		book2.price = 15900;

		System.out.println(book1.name + "은 " + book1.price + "원 이다");
		System.out.println(book2.name + "은 " + book2.price + "원 이다");
	}

}
