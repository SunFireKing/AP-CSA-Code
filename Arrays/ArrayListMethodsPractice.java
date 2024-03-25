import java.util.ArrayList;
class ArrayListMethodsPractice
{
   public static void main(String[] args) {
   ArrayList<String> sarray = new ArrayList<>();
   //first test 
   sarray.add("four");
   sarray.add("score");
   sarray.add("and");
   sarray.add("seven");
   sarray.add("years");
   sarray.add("ago");
   //
   //added this for second test case instead of creating new one
   sarray.add("nut");
   //works
   swapPairs(sarray);
   System.out.println(sarray);
   //tested
   //Use same list to remove the even words
   sarray.add("even");
   sarray.add("eighteen");
   removeEvenLength(sarray);
   //print
   System.out.println(sarray);
   //
   //Use same list for double list
   doubleList(sarray);
   System.out.println(sarray);
   //
   ArrayList<Integer> iarray = new ArrayList<>();
   iarray.add(3);
   iarray.add(8);
   iarray.add(92);
   iarray.add(4);
   iarray.add(2);
   iarray.add(17);
   iarray.add(9);
   minToFront(iarray);
   System.out.println(iarray);
   }
   //check array size then set i and i+1 into temp vars and switch
   public static void swapPairs(ArrayList<String> array) {
      if (array.size() % 2 == 0) {
         for (int i = 0; i < array.size()-1; i = i + 2) {
            String el1 = array.get(i);
            String el2 = array.get(i+1);
            array.set(i, el2);
            array.set(i+1, el1);
         }
      } else {
      for (int i = 0; i < array.size()-2; i = i + 2) {
         String el1 = array.get(i);
            String el2 = array.get(i+1);
            array.set(i, el2);
            array.set(i+1, el1);
      }
   }
   }
   //check each string's value and remove, always start from end of the arraylist
   public static void removeEvenLength(ArrayList<String> array) {
      for (int i = array.size()-1; i >= 0; i--) {
         if (array.get(i).length() % 2 == 0) {
            array.remove(i);
         }
      }
   }
   //start from top and add to i + 1 rather than beginning bcz then the end is skipped
   public static void doubleList(ArrayList<String> array) {
      for (int i = array.size()-1; i >=0; i--) {
         array.add(i+1, array.get(i));
      }
   }
   //loop through for smallest value
   public static void minToFront(ArrayList<Integer> array) {
      int min = array.get(0); int mindex = 0;
      for (int i = 1; i < array.size()-1; i++) {
         if (min > array.get(i)) {
            min = array.get(i);
            mindex = i;
         }
      }
      //select old index and delete while appending to beginning
      array.remove(mindex);
      array.add(0, min);
   }




}