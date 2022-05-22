package BookManage;

public class BookService {
	static Book[] books = new Book[100];
	static int count = 1;
	boolean isRun = true;
	static int selectNo = 0;
	static BookData data = new BookData();

	public static void registerBook() {
		System.out.println("1. 도서등록");
		String title = data.getData("등록할 도서의 제목을 입력해주세요.");
		String author = data.getData("등록할 도서의 저자를 입력해주세요.");

		for(int i=0; i<books.length; i++) {
			if(books[i] == null) {
				count = i+1;
				books[i] = new Book(count, title, author);
				System.out.println("등록완료");
				break;
			}		
		}
	}
	public static void selectBook() {
		System.out.println("2. 도서목록");

		for(Book b : books) {
			if(b != null) {
				printBookInfo(b);
			}
		}
	}
	public static void updateBook() {
		System.out.println("3. 도서수정");
		int bookNum = data.getSelectNum("수정할 도서의 관리 번호를 입력하세요. >");
		Book b = findBook(bookNum);

		if(b == null) {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
			return;
		}
		boolean isUpdate = true;
		while (isUpdate) {
			System.out.println("====================================================");
			System.out.println("1. 제목수정 | 2. 저자수정 | 3. 수정완료");
			System.out.println("====================================================");

		selectNo = data.getSelectNum("번호입력 >>");

		switch(selectNo)
		{
		case 1 :
			String title = data.getData("제목을 수정해주세요 >>");
			b.setTitle(title);
			System.out.println("제목 수정 완료 ");

		case 2 : 
			String author = data.getData("저자 이름을 수정해주세요 >>");
			b.setAuthor(author);
			System.out.println("저자 이름 수정완료");
		case 3 :
			System.out.println("수정메뉴 종료");
			isUpdate = false;
			break;
			}
		}
	}
	public static void deleteBook(){
		System.out.println("4. 도서삭제");
		int bookNum = data.getSelectNum("삭제할 도서의 관리번호를 입력하세요.");

		Book b = findBook(bookNum);

		if(b == null) {
			System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
			return;
		}

		for(int i = 0; i < books.length; i++) {
			if(books[i] != null && books[i].getNum() == bookNum) {
				books[i] = null;
				System.out.println("삭제 완료");
				return;
			}
		}
	}
	static void printBookInfo(Book b) {
		System.out.println(b.toString());
	}

	public static Book findBook(int num) {
		for(int i = 0; i< books.length; i++) {
			if(books[i] != null && books[i].getNum() == num) {
				return books[i];
			}
		}

		return null;
	}

}


