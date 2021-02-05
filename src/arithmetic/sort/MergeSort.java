package arithmetic.sort;

/**
 *
 *@Description 归并排序
 *@Author backen
 *@Date 2021/2/3 9:11
 *
 */

/*
思路：递归入口>>   ①一个数组，切成两块，左边一块，右边一块。
                ②把左边排好序，再把右边排好序
                ③对左右两边已经排好序的数组进行 merge合并 操作
*/

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,2,78,23,45,56,99,0,100};
        mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    //归并排序方法
    public static void mergeSort(int[] arr){
        //如果数组为null或者只有一个元素，则不需要排序，方法结束
        if(arr == null || arr.length == 1){
            return;
        }
        //数组长度大于2时，进行排序。
        process(arr,0,arr.length-1);
    }

    //传一个数组进来，对在（l-r）这个范围的数据进行排序，对于一个完整的数组，l=0,r=arr.length-1。
    public static void process(int[] arr,int l,int r){
        if (l == r){
            return;
        }
        //求索引中间值，把传进来的数组砍成两半
        int mid = l + (( r-l) >>1);//右移1位=除2
        //左边的 当成 新的数组 进行排序，右边同理。递归出口是 数组长度为1的时候，即 if（l == r）时
        process(arr,l,mid);
        process(arr,mid+1,r);
        //对左右两边已经排好序的数组进行 merge合并 操作
        merge(arr,l,mid,r);
    }

    //传一个数组进来（左右两边已经排好序了），进行 merge交换合并操作
    public static void merge(int[]arr,int l,int m,int r){
        //定义一个相同长度的辅助数组
        int[] help =new int [r - l +1];
        int i =0; //辅助数据角标，从help[0]开始装数据，每装入一个数，i++，p指针也++
        int p1 = l; //p1指针（左半边）指向数组左半边第一个数
        int p2 = m+1;//p2指针（右半边）指向数组右半边第一个数
        //如果指针位置都在自己 工作范围 内，那么两个数比较取最小，放入help中，然后指针后移一位
        while (p1 <= m && p2 <= r){
            help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
        }
        //如果其中一个指针已经超过了 自己 工作范围 内,那么把另外一个指针指向的数组copy到help中
        while (p1 <= m){
            help[i++]= arr[p1++];
        }
        while (p2 <= r){
            help[i++]= arr[p2++];
        }
        //将辅助数组拷贝到原来数组
        for (int j = 0; j < help.length; j++) {
            arr[l+j] = help[j];
        }
    }
}
