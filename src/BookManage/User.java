package BookManage;


public class User extends Login {
	private String name ;
	private String date ;
	private String phone;
	
	public static String[] user_List; // 
	private final int USER_LIST_LENGTH = 1; // 관리자 수

	public User() {
		// 처음만 배열 생성
		if (user_List == null)
			user_List = new String[USER_LIST_LENGTH];
	}
    // User안에 저장될 배개변수들
	public User(String name, String date, String phone) {
        //super();
        this.name=name;
        this.date=date;
        this.phone=phone;
    }
	

}
