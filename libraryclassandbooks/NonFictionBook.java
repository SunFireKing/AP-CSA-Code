public class NonFictionBook extends Book {
   private double deweyDecimal;
   
   public NonFictionBook() {
      super();
      deweyDecimal = 0;
   }
   
   public NonFictionBook(String x, String y, int z, double a) {
      super(x, y, z);
      deweyDecimal = a;
   }
   
   /*public String toString() {
      return "title: " + getTitle() + "\n" +
             "author: " + getAuthor() + "\n" +
             "number of Pages: " + getnumPages() + "\n" + 
             "Dewey Decimal Number: " + deweyDecimal + "\n"; 
   }*/
   
   public String toString() {
      return super.toString() + "Dewey Decimal Number: " + deweyDecimal + "\n";
   }
   
   public boolean equals(NonFictionBook x) {
      if (super.equals(x) && this.deweyDecimal == (x.deweyDecimal)) {
         return true;
      } else {
         return false;
      }
   }
}  