package src.com.yellow.arithmetic;/**
 * @Description TODO
 * @Author 11366
 * @Date 2021/2/4 9:32
 */

/**
 *
 *@Description kmp算法（字符串匹配算法）
 *@Author backen
 *@Date 2021/2/4 9:32
 *
 */
public class kmp1 {
    public static void main(String[] args) {
        String s1 ="178000999941178";
        String s2 ="9999";
        int kmp_index = kmp(s1, s2);
    }

    private static  int[] getNextArray(char[] str2){
        if (str2.length == 1){
            return new int[]{-1};
        }
        int[] next = new int[str2.length];
        next[0] = -1;
        next[1] = 0;
        int i = 2;
        int sc =0;
        while(i<next.length){
            if (str2[i-1] == str2[sc]){
                next[i++] = ++sc;
            }else if(sc > 0){
                sc =  next[sc];
            }else{
                next[i++] = 0;
            }
        }
     return  next;
    }

    public static int kmp(String s1,String s2){
        if (s1 == null || s2 == null || s1.length() < s2.length() || s2.length() < 1){
            return -1;
        }
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int[] nextArray2 = getNextArray(str2);
        int x = 0,y = 0;
        while(x < str1.length && y < str2.length){
            if (str1[x] == str2[y]){
                x++;
                y++;
            }else if (y>0){
                y = nextArray2[y];
            }else {
                x++;
            }

        }return y == str2.length ? x-y : -1;
    }


}
