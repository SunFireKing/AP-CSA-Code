import java.util.ArrayList;
public class CodingExercise74 {
   public static void main(String[] args) {
   //Create array integer and add values then call binary search
      ArrayList<Integer> array = new ArrayList<>();
      array.add(5);
      array.add(6);
      array.add(10);
      array.add(12);
      array.add(13);
      array.add(20);
      System.out.print(BinarySearch(array, 13));
    //Create int arra and then call removeinRange
      ArrayList<Integer> arra = new ArrayList<>();
      arra.add(0);
      arra.add(0);
      arra.add(2);
      arra.add(0);
      arra.add(4);
      arra.add(0);
      arra.add(6);
      arra.add(0);
      arra.add(8);
      arra.add(0);
      arra.add(10);
      arra.add(0);
      arra.add(0);
      arra.add(0);
      arra.add(12);
      arra.add(0);
      arra.add(14);
      arra.add(0);
      arra.add(16);
      removeInRange(arra, 0, 5, 13);
      System.out.print(arra);
      
   }
   //binary serch from class
   public static int BinarySearch(ArrayList<Integer> arr, int target) {
      int low = 0;
      int mid = arr.size()/2;
      int high = arr.size() - 1;
      
      while(low <= high) {
         if (arr.get(mid) == target) {
            return mid;
         } else if (mid < target) {
            low = mid + 1;
            mid = (low + high)/2;
         } else {
            high = mid - 1;
            mid = (low + high)/2;
         }
      }
      return -1;
   }
   //ineffective remove from class 
   public static void removeInRange(ArrayList<Integer> arr, int ele, int start, int end) {
      ArrayList<Integer> array = new ArrayList<>();
      for (int i = end; i >= start; i--) {
         if (arr.get(i) == ele) {
            arr.remove(i);
         }
      }
   } 

}