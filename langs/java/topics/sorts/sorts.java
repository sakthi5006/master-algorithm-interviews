import java.util.*;

class Main {

  public static void main(String[] args) {
    int[] arr = new int[]{ 3,2,1};
    int[] sortedArr = new Main().selectionSort(arr);
    Arrays.stream(sortedArr).forEach(e -> System.out.println(e));
  }

  public void selectionSort(int[] arr){
    int N =  arr.length;
    for(int i =0; i < N -1; i++) {
      int iMin = i;
      for(int j =i+1; j < N; j++) {
        iMin = arr[j] <= arr[iMin]? j: iMin; 
      }
      if(i != iMin) {
        int temp = arr[i];
        arr[i] = arr[iMin];
        arr[idx] = temp;
      }
    }
  }
}
