package BookManage;

import java.util.Scanner;



public class BookManager extends BookService {
	
	Scanner sc = new Scanner(System.in);
	public User user = new User(); 
	int count = 1;
	static boolean isRun = true;
	static int selectNo = 0;
	static BookData data = new BookData();
	String arr[] = { "기본관리자", "999999", "010-1234-5678"}; // 현재 기본 관리자
	// arr[0] = 관리자 이름, arr[1] = 관리자 생년월일 , arr[2] = 관리자 연락처
	
	
	// 스캐너 받은걸 int형으로 바꺼서 내보냄 한글 특수문자 걸르기!!
	public int checkInputScanner(String input, String print) {
		if (isNumber(input)) { // 숫자만 있으면
			int number = Integer.parseInt(input);
			if (number < 0) {
				System.out.println("음수를 입력할수 없습니다. 다시입력해주세요.");
				System.out.print(print);
				return checkInputScanner(sc.next(), print);
			} else
				return number;

			} else {
				System.out.println("올바른 형식이 아닙니다. 다시입력해주세요. (자리제한:10)");
				System.out.print(print);
				return checkInputScanner(sc.next(), print);
			}
		}
	
		// 숫자만 있는지 체크 숫자만 있으면 true, 없으면 false;
	public boolean isNumber(String str) {
		return str.matches("^\\d{0,10}");
		}
	
	
	
	// 로그인
		public String Login() {
			
			String id;
			String pw;
			
			System.out.print("아이디를 입력하세요.");
			id = sc.next();
			System.out.print("비번을 입력하세요.");
			pw = sc.next();
			
			// 관리자 로그인 체크
			if (user.admin_Check(id, pw)) {
				System.out.println("관리자로 로그인 하셨습니다.");
				return "관리자";
			} else {
				System.out.println("아이디 혹은 비밀번호가 맞지않습니다.");
			    return "관리자아님";
			}
		}
	
	public void inputLogin() {
		

		while (isRun) {
			System.out.println("────────────도서관리 프로그램───────────");
			System.out.println("   로그인이 필요합니다 0.종료 1.로그인      ");
			System.out.println("───────────────────────────────────");
			System.out.print("───> ");
			int i = checkInputScanner(sc.next(), "───> ");

			switch (i) {
			case 0:
				// 종료
				System.out.println("프로그램을 종료 합니다.");
				isRun = false;
				break;
			case 1:
				// 로그인
				String c = Login();

				// 오늘날짜저장
				setDate();
               
				if (c.equals("관리자")) {
					System.out.println("───────────────────────────────관리자 로그인────────────────────────────");
					System.out.println(" 접속날짜:" + today + " ");
					System.out.println(" ========================= 현재 관리자 정보 ============================");
					System.out.println(" 이름:" + arr[0] + "    생년월일:" + arr[1] +  "    연락처" + arr[2] + "  ");
					System.out.println("─────────────────────────────────────────────────────────────────────");
					showMain();
				}
				
				break;
			
			default:
				System.out.println("없는 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void showMain() {
		while(isRun) {
			System.out.println("                     관리자 메뉴                          ");
			System.out.println("======================================================================");
			System.out.println("0. 관리자 정보수정 | 1. 도서등록 | 2. 도서목록 | 3. 도서수정 | 4. 도서삭제 | 5. 종료");
			System.out.println("======================================================================");
			selectNo = data.getSelectNum("번호를 선택하세요 > ");

			switch(selectNo)
			{
			case 0 : 
				updateUser();
				break;
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
	
	public String[] updateUser() {
		System.out.println("                ======= 현재 관리자 정보 =========");
		System.out.println("    이름:" + arr[0] + "    생년월일:" + arr[1] +  "    연락처:" + arr[2] + "  ");
		System.out.println("관리자 정보를 수정하시려면 1를 입력해주세요.0을 누르시면 초기화면으로 갑니다");
		Scanner sc = new Scanner(System.in);
		int upd = sc.nextInt();
		
		switch(upd) {
		
		case(0) : 
			showMain(); // 첫 화면으로 이동
			break;
		
		case(1) :
			System.out.print("수정할 이름을 입력하세요.");
		    String n = sc.next();
		    arr[0] = n;
		    System.out.print("수정할 생년월일을 입력하세요.");
		    String d = sc.next();
		    arr[1] = d;
		    System.out.print("수정할 연락처를 입력하세요.");
		    String p  = sc.next();
		    arr[2] = p;
		    
		    }
		return arr;  // 수정된 값들 반환
		
	}
	public static void terminate() {
		System.out.println("프로그램 종료");
		isRun = false;
	}
}

