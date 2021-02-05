package arithmetic.sort;

import java.util.Arrays;

/**
 *
 *@Description 归并排序-递归实现
 *@Author backen
 *@Date 2021/2/3 13:39
 *
 */
public class MergeSort1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,2,78,23,45,56,99,0,100};
        Arrays.sort(arr);
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void mergeSort(int[] arr){
        if(arr == null || arr.length<2){
            return;
        }
        process(arr,0,arr.length-1);
    }

    public static void process(int[] arr, int l, int r){
        if (l == r){
            return;
        }
        int mid = l + ((r-l) >> 1);
        process(arr,l,mid);
        process(arr,mid+1,arr.length-1);
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr, int l, int mid , int r){
        int[] help = new int[r-l+1];
        int i =0;
        int p1 = l;
        int p2 = mid +1;
        while (p1<=mid && p2<=r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] :arr[p2++];
        }
        while(p1 <= mid){
            help[i++] = arr[p1++];
        }
        while(p2 <= r){
            help[i++] = arr[p2++];
        }

        for (int j = 0; j < help.length; j++) {
            arr[l+j] = help[j];
        }
    }
}
