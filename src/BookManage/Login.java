package BookManage;


public class Login{
	public String name;
	private String date; //private
	private String phone; //private
	private static final String ADMIN_ID = "admin"; //관리자 아이디 
	private static final String ADMIN_PW = "1234"; //관리자 비번
	
	
	// 관리자인지 체크
	public boolean admin_Check(String id, String pw) {
		if(id.equals(ADMIN_ID) && pw.equals(ADMIN_PW))
			return true;
		
		return false;
	}

	

}