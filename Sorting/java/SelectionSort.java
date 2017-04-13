public class SelectionSort extends Utilities {

  public static int min(int[] arr, int start) {
    int min = 2147483647;
    int index = 0;
    for(int i=start; i<arr.length; i++) {
      if(arr[i] < min) {
        min = arr[i];
        index = i;
      }
    }
    return index;
  }

  public static int[] sort(int[] arr) {
    int arrayLength = arr.length;
    int minIndex = 0;
    int temp;
    for(int i=0;i<arrayLength;i++) {
      minIndex = min(arr, i);
      System.out.println("min index: "+minIndex);
      temp = arr[minIndex];
      arr[minIndex] = arr[i];
      arr[i] = temp;
    }

    return arr;
  }

  public static void main(String[] args) {
    int[] arr = {4,7,1,3,9,67,12,45,87,65,77,20};
    log(sort(arr));
  }
}
