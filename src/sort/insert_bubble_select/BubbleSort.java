package sort.insert_bubble_select;

public class BubbleSort {
    public void bubbleSort(int[] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 1;j < arr.length - i;j++){
                if(arr[j] < arr[j - 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
