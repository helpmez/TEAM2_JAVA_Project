package BookManage;

import java.util.Scanner;

public class BookManager extends BookService {
	Scanner sc = new Scanner(System.in);
	int count = 1;
	static boolean isRun = true;
	static int selectNo = 0;
	static BookData data = new BookData();

	public BookManager() {
		showMain();
	}

	public void showMain() {
		while(isRun) {
			System.out.println("                     관리자 메뉴                          ");
			System.out.println("========================================================");
			System.out.println("1. 도서등록 | 2. 도서목록 | 3. 도서수정 | 4. 도서삭제 | 5. 종료");
			System.out.println("========================================================");
			selectNo = data.getSelectNum("번호를 선택하세요 > ");

			switch(selectNo)
			{
			case 1 :
				registerBook();
				break;
			case 2 :
				selectBook();
				break;
			case 3 :
				updateBook();
				break;
			case 4 :
				deleteBook();
				break;
			case 5 : 
				terminate();
				break;
			default : 
				System.out.println("등록된 메뉴가 아닙니다.");
			}
		}
	}
	public static void terminate() {
		System.out.println("프로그램 종료");
		isRun = false;
	}
}