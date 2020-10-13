package sort.insert_bubble_select;

public class SelectSort {
    public void selectSort(int[] arr){
        for(int i = 0;i < arr.length - 1;i++){
            int min = arr[i];
            int k = i;
            for(int j = i + 1;j < arr.length;j++){
                if(arr[j] < min){
                    min = arr[j];
                    k = j;
                }
            }
            arr[i] = min;
            arr[k] = arr[i];
        }
    }
}
