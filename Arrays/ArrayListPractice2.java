import java.util.ArrayList;
class ArrayListPractice2 {
   public static void main(String[] args) {
      ArrayList<String> strlist = new ArrayList<String>();
      strlist.add("micah");
      strlist.add( "dogs"); 
      strlist.add("calculator"); 
      strlist.add("federal reserve"); 
      strlist.add("hearthstone");
      for (int i = 0; i < strlist.size(); i++) {
         System.out.println(strlist.get(i));
      }
      strlist.add(0,"word");
      strlist.add(strlist.size()-1, "man");
      strlist.remove(2);
      strlist.set(3, "edge");
      ArrayList<String> array = new ArrayList<String>();
      array.add("micah");
      array.add("science");
      array.add("technology");
      array.add("computers");
      array.add("website");
      array.add("calculator");
      ArrayList<String> narr = new ArrayList<String>();
      
      for (int i = 0; i < strlist.size(); i++) {
         for(int j = 0; j < array.size(); j++) {
            if(array.get(j) == strlist.get(i)) {
               narr.add(array.get(j));
            }
         }
      }
      for(int i = narr.size()-1; i >= 0; i--) {
         narr.remove(i);
      }

   }






}