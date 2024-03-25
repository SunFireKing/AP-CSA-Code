public class FictionBook extends Book {
   private String genre;
   //constrcuctors
   public FictionBook() {
      super();
      genre = "unknown";
   }
   
   public FictionBook(String x, String y, int z, String a) {
      super(x, y, z);
      genre = a;
   }
   
   /*public String toString() {
      return "title: " + getTitle() + "\n" +
             "author: " + getAuthor() + "\n" +
             "number of Pages: " + getnumPages() + "\n" + 
             "genre: " + genre + "\n"; 
   }*/
   //tostring using super toString
   public String toString() {
      return super.toString() + "genre: " + genre + "\n"; 
   }
   
   public boolean equals(FictionBook x) {
      if (super.equals(x) && this.genre.equals(x.genre)) {
         return true;
      } else {
         return false;
      }
   }

}