import java.util.*;
import java.lang.*;
import java.util.stream.*;

class Main {

  public static void main(String[] args) {
    
    int[] input = new int[]{ 4,2,3,1};

    System.out.println("----- Input -----");
    SortUtils.printArr(input);

    for(SortTypes type: SortTypes.values()){
      System.out.println(String.format("--- %s Sort -----", type));
      SortUtils.printArr(
        IntSortFactory.getSorter(type)
        .sort(
          SortUtils.copy(input)
          )
        );
    }    
  }

}

interface IntSortable{
  int[] sort(int[] arr);
}

enum SortTypes {
  SELECTION,
  BUBBLE,
  INSERTION,
}

class IntSortFactory{
  public static IntSortable getSorter(SortTypes type){
    switch(type){
     case SELECTION:
      return new SelectionSort();
      case BUBBLE:
      return new BubbleSort();
      case INSERTION:
      return new InsertionSort();
      default:
        throw new IllegalArgumentException(
          String.format("%s sort is supported", type )
          );
    }
  }

}

 /**
 /* Selection sort 
 /*  Divide array in left and right 
 /* left always has sorted elements
 /*  find min/max in right array till exhausts 
 **/
class SelectionSort implements IntSortable {
  
  public int[] sort(int[] arr){
    int N =  arr.length;
    for(int i =0; i < N -1; i++) {
      int iMin = i;
      for(int j =i+1; j < N; j++) {
        iMin = arr[j] <= arr[iMin]? j: iMin; 
      }
      if(i != iMin) {
        SortUtils.swap(i,iMin, arr);
      }
    }
    return arr;
  }
  
}

  /**
  /* Compare and swap
  **/
class BubbleSort implements IntSortable{

  public int[] sort(int[] arr){
    int N =  arr.length;
      for(int i =0; i < N; i++) {
        for(int j =0; j < N-1; j++) {
          if(arr[j] >= arr[j+1]){
            SortUtils.swap(j,j+1,arr);
          }
        }

      }
      return arr;
  }

}


class InsertionSort implements IntSortable{

  public int[] sort(int[] arr){
    int N =  arr.length;
      for(int i =1; i < N; i++) {
        int value = arr[i];
        int hole = i;
        while(hole > 0 &&  arr[hole-1] >= value) {
          arr[hole] = arr[hole-1];
           hole = hole-1;
        }
       arr[hole] = value;
      }
      return arr;
  }

}

class SortUtils {

  public static void swap(int i, int j, int[] arr) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
  }

   static void printArr(int intArray[]) {
     System.out.println( IntStream.of(intArray)
            .mapToObj(Integer::toString)
            .collect(Collectors.joining(", ")));
 
  }

  public static int[] copy(int[] input){
        int[] arr = new int[input.length];
      System.arraycopy(input, 0, arr,0, input.length);
      return arr;
  }
}
