package BookManage;

public class Book {
	  private int num;
	    private String title;
	    private String author;
	    
	    public Book()
	    {}
	    
	    public Book(int num, String title, String author) {
	        super();
	        this.num = num;
	        this.title = title;
	        this.author = author;
	        
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
	    
	    public String toString() {
	        return "Book[num : " +this.num +"] [title : "+this.title +"] [author : "+this.author+"])";
	    }
	}

