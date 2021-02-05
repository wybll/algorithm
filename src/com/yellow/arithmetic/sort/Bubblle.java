package src.com.yellow.arithmetic.sort;

/**
 *
 *@Description 冒泡排序:每次都是 相邻 的两个数比较大小
 *@Author backen
 *@Date 2021/2/5 13:48
 *
 */
public class Bubblle {
    public static void main(String[] args) {
        int[] arr = new int[]{9,7,3,3,45,2,34,56,78,12,0};
        bubbling(arr);
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    public static void bubbling(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        int temp;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
