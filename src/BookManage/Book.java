package BookManage;

public class Book {
	  private int num;
	    private String title;
	    private String author;
	    private String bAvailable; // 책 대출 가능 여부
	    private String date; // 책 대출 날짜
	    
	    //Book에 저장될 매개변수들
	    public Book(int num, String title, String author, String bAvailable, String date) {
	        //super();
	        this.num = num;
	        this.title = title;
	        this.author = author;
	        this.bAvailable = bAvailable;   
	        this.date = date;
	    }
	    public int getNum() {
	        return num;
	    }
	    public void setNum(int num) {
	        this.num = num;
	    }
	    
	    public String getTitle(){
	        return title;
	    }
	    
	    public void setTitle(String title) {
	        this.title = title;
	    }
	    
	    public String getAuthor() {
	        return author;
	    }
	    
	    public void setAuthor(String author) {
	        this.author = author;
	    }
	    
	    public String isbAvailable() {
	        return bAvailable;
	    }
	 
	    public void setbAvailable(String bAvailable) {
	        this.bAvailable = bAvailable;
	    }
	    
	    public String getDate() {
	        return date;
	    }
	 
	    public void setDate(String date) {
	        this.date = date;
	    }
	    
	    public String toString() {   //  책 정보 출력 형식
	        return "Book[번호 : " +this.num +"] [제목 : "+this.title +"] [작가 : "+this.author+"] "
	        		+ "[대출가능여부 : "+this.bAvailable+"] [대출/반납된 날짜 : "  +this.date+"]" ;
	    }
	}

