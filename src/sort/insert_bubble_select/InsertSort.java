package sort.insert_bubble_select;

import java.util.Random;

public class InsertSort {

    public void insertSort(int[] arr){
        int n = arr.length;
        int i = 1;
        while(i < n){
            int value = arr[i];
            int j;
            for(j = i - 1;j >= 0;j -- ){
                if(arr[j] > value){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = value;
            i++;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
    }




}
