package BookManage;

import java.util.Scanner;

public class BookData {
	Scanner sc = new Scanner(System.in);
    // 입출력 기능 제공 클래스 //
	String getData(String message) {
		System.out.println(message);
		return sc.next();
	}
	
	int getSelectNum(String message) {
		System.out.println(message);
		return sc.nextInt();
	}


}
