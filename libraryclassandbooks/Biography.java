public class Biography extends NonFictionBook {
   private String subject;
   
   public Biography() {
      super();
      subject = "unknown";
   }
   
   public Biography(String x, String y, int z, double a, String b) {
      super(x, y, z, a);
      subject = b;
   }
   //
   public String getSubject() {
      return subject;
   }
   
   public void setSubject(String b) {
      subject = b;
   }
   //check if the book was written by the person who is the subject of the book
   public boolean autobiography() {
      if(subject.equals(getAuthor())) {
         return true;
      } else {
         return false;
      }
   }
   
   public String toString() {
      return super.toString() + "subject: " + subject + "\n";
}
   
}