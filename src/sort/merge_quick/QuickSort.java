package sort.merge_quick;

public class QuickSort {

    public void quickSort(int[] arr){
        quickSort(arr,0,arr.length - 1);
        for(int k:arr){
            System.out.print(k+" ");
        }
    }

    public void quickSort(int[] arr,int q,int r){
        if(q > r){
            return;
        }

        int m = partition(arr,q,r);
        quickSort(arr,q,m-1);
        quickSort(arr,m+1,r);
    }

    public int partition(int[] arr,int q,int r){
        int value = arr[q];
        int nl = q;
        int nr = r;
        while(nl < nr){

            while(arr[nr] >= value && nl < nr){
                nr -- ;
            }



            while(arr[nl] <= value && nl < nr){
                nl++;

            }

            if(nl < nr){
                int tmp = arr[nl];
                arr[nl] = arr[nr];
                arr[nr] = tmp;
            }


        }
        int p = arr[nl];
        arr[nl] = arr[q];
        arr[q] = p;
        return nl;
    }
}
