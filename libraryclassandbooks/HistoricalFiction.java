public class HistoricalFiction extends FictionBook {
   private int year;
   
   
   public HistoricalFiction() {
      super();
   }
   
   public HistoricalFiction(String x, String y, int z, String a, int b) {
      super(x, y, z, a);
      year = b;
      
   }
   
   public int getYear() {
      return year;
   }
   
   public void setYear(int a) {
      year = a;
   }
   
   public String period() {
      if (year > 1999) {
         return "twenty-first century";
      } else if (year > 1915) {
         return "democratic era";
      } else if (year > 1820) {
         return "Victorian era";
      } else if (year > 1500) {
         return "Colonial Era";
      } else if (year > 476 && year < 1450) {
         return "Middle Ages";
      } else if (year > 31) {
         return "Imperial Rome";
      } else if (year > -510) {
         return "Republican Rome";
      } else if (year < -510) {
         return "ancient times";
      } else {
         return "Insignificant";
      }
   }
   
   public String toString() {
      return super.toString() + "year: " + year + "\n";
}
}