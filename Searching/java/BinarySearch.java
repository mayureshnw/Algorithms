public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int searchTerm = 12;
    int low = 0;
    int high = arr.length-1;
    while(low < high) {
      int mid = (low + (high-low)/2);
      if(searchTerm == arr[mid]) {
        System.out.println("Found Search Term "+searchTerm+" at index "+mid);
        break;
      }

      else if ( searchTerm > arr[mid]) {
        low = mid+1;
      } else {
        high = mid-1;
      }
    }
  }
}
