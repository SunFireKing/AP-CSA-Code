import java.util.ArrayList;
public class Library {
   private ArrayList<Book> bookList;
   //declare the bookList
   public Library() {
      bookList = new ArrayList<Book>();
   }
   
   public ArrayList<Book> getList() {
      return bookList;
   }
   //add to bookList
   public void addBook(Book x) {
      bookList.add(x);
   }
}