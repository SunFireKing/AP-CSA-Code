import java.util.ArrayList;
public class Book {
   private String title;
   private String author;
   private int numPages;
   private static int countBooks;
  
   public Book() {
      title = "unknown";
      author = "unknown";
      numPages = 0;
      countBooks++;
   }
   
   public Book(String x, String y, int z) {
      title = x;
      author = y;
      numPages = z;
      countBooks++;
   }
   
   public String getTitle() {
      return title;
   }
   
   public String getAuthor() {
      return author;
   }
   
   public int getnumPages() {
      return numPages;
   }
   
   public void setTitle(String x) {
      title = x;
   }
   
   public void setAuthor(String x) {
      author = x;
   }
   
   public void setnumPages(int x) {
      numPages = x;
   }
   
   public String toString() {
      return "title: " + title + "\n" +
             "author: " + author + "\n" +
             "number of Pages: " + numPages + "\n";
              
   }
   
   public boolean equals(Book x) {
      if (this.title.equals(x.getTitle()) && this.author.equals(x.getAuthor())) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public static String[][] listDetails(ArrayList<Book> bookList) {
      String[][] bookArray = new String[2][bookList.size()];
      for (int j = 0; j < bookList.size(); j++) {
            bookArray[0][j] = bookList.get(j).getTitle();
            bookArray[1][j] = bookList.get(j).getAuthor();
         }
      return bookArray;
   }
}