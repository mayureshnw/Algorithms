import java.util.*;

public class BubbleSort {

  public static void log(int[] arr) {
    for(int i=0;i<arr.length;i++) {
      System.out.print(arr[i]+ " ");
    }
    System.out.println(" ");
  }

  public static int[] sort(int[] arr) {
    for(int i=arr.length-1;i>0;i--) {

      int end = arr.length - i;
      System.out.println("==SUB START==");
      for(int j=arr.length -1; j>=end; j--) {
        if (arr[j] < arr[j-1]){
          int temp = arr[j];
          arr[j] = arr[j-1];
          arr[j-1] = temp;
        }
        log(arr);
      }
      System.out.println("==SUB END==");
      System.out.println(" ===========START=========== ");
      log(arr);
      System.out.println(" ===========END=========== ");
    }
    return arr;
  }



  public static void main(String[] args) {
    int[] randomNumbers = {4,7,1,3,9,67,12,45,87,65,77,20};
    int[] sorted = sort(randomNumbers);
    System.out.println(sorted.length);
  }
}
