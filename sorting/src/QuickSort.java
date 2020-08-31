public class QuickSort {
  public int[] quickSort(int[] arr, int low, int high){
    if(low < high){
      int pi = partition(arr, low, high);
      quickSort(arr, low, pi-1);
      quickSort(arr, pi+1, high);
    }
    return arr;
  }

  public int partition(int[] arr, int low, int high){
    int i = low - 1;
    int pivot = arr[high];

    for(int j = low; j <= high - 1; j++){
      if(arr[j] <= pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
    return (i+1);
  }

  public static void main(String[] args) {
    int[] arr = {10, 80, 30, 90, 40, 50, 70};
    QuickSort quickSort = new QuickSort();
    int[] result = quickSort.quickSort(arr, 0, arr.length-1);
    for(int j : result){
      System.out.println(j);
    }
  }
}
