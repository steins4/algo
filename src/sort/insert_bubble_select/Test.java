package sort.insert_bubble_select;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[20];
        for(int i = 0;i < 20;i++){
            arr[i] = random.nextInt(1000);
        }

        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        /*//插入排序
        new InsertSort().insertSort(arr);*/

      /*  //冒泡排序
        new BubbleSort().bubbleSort(arr);
*/
        //选择排序
        /*new SelectSort().selectSort(arr);*/
    }
}
