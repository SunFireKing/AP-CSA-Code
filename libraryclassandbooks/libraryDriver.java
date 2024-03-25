import java.util.ArrayList;
public class libraryDriver {
   public static void main(String[] args) {
      Library schoollib = new Library();
      Biography book1 = new Biography("bookq", "sooryta", 7482, 48.3, "sooryta");
      HistoricalFiction book2 = new HistoricalFiction();
      SciFi book3 = new SciFi();
      Book book4 = new Book();
      
      boolean value = book1.equals(book2);
      schoollib.addBook(book1);
      schoollib.addBook(book2);
      schoollib.addBook(book3);
      schoollib.addBook(book4);
      
      ArrayList<Book> newList = schoollib.getList();
      System.out.println(newList);
      
      String[][] array = Book.listDetails(newList);
      for (String[] i : array) {
         for (String j : i) {
            System.out.println(j);
         }
      }
   }
}