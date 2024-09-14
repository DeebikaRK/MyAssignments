package week1.day4;

public class library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library book1=new library();
		String title=book1.addBook("Java");
		System.out.println(title);
		book1.issueBook();
 
		}
		public String addBook(String bookTitle)
		{
			return("Java");
		}
		public void issueBook()
		{
			System.out.println("Book Issued Successfully");
		}
	}	
