package sort.merge_quick;

public class MergeSort {
    public void mergeSort(int[] arr){
        mergeSort(arr,0,arr.length - 1);
        for(int k:arr){
            System.out.print(k+" ");
        }
    }


    public void mergeSort(int[] arr,int p,int r){
        if(p >= r){
            return ;
        }
        int m = (p + r) / 2;
        mergeSort(arr,p,m);
        mergeSort(arr,m+1,r);

        merge(arr,p,m,r);
    }

    public void merge(int[] arr,int p,int m,int r){
        int[] tmp = new int[r - p + 1];
        int nl = p;
        int nr = m+1;
        int i = 0;
        while(nl <= m && nr <= r){
            if(arr[nl] <= arr[nr]){
                tmp[i++] = arr[nl];
                nl++;
            }else{
                tmp[i++] = arr[nr];
                nr ++ ;
            }
        }
        if(nl > m){
            while(nr <= r){
                tmp[i ++ ] = arr[nr ++ ];
            }
        }else{
            while(nl <= m){
                tmp[i ++ ] = arr[nl ++ ];
            }
        }

        for(int j = 0;j < tmp.length;j++){
            arr[j + p] = tmp[j];
        }
    }
}
