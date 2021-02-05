package arithmetic;

public class kmp {
    public static void main(String[] args) {
            String s1 = "abhfkabhjdjfkdsk";
            String s2 = "abh";
        int i = kmpArithmtic(s1, s2);
        System.out.println(i);
    }
    public static int kmpArithmtic(String s1,String s2){
        //判断两个数组不为空，且s2的长度要小于等于s1
        if (s1 == null || s2 == null || s2.length() < 1 || s1.length() < s2.length()){
            return -1;
        }
        //字符串变成字符数组
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        //定义两个指针，分别指向str1和str2的首部
        int x = 0;
        int y = 0;
        //获取str2的next数组
        int[] next = getNextArray(str2);
        //当两指针分别还在数组范围内，则该位置字符判断是否相等
        while (x < str1.length && y < str2.length){
            if(str1[x] ==  str2[y]){//两个比较字符 相等，则两指针分别后移一位,继续比较
                x++;
                y++;
            }else if(next[y] == -1){//只有当指针指向str2[0]时，也就是y=0,说明str2无法再左移。此时str1指针后移一位，x++
                x++;
            }else{//当y指针还能左移，则当前next[y]的值付给y指针（因为next数组）
                y = next[y];
            }
        }
        //只有当str2全部匹配，y指针大于str2的长度时，跳出循环，返回索引差值（x-y）; 如果所有的x都不匹配，则x越界，跳出循环，返回-1
        return y == str2.length ? x-y : -1;
    }

    //获取字符数组的 next数组
    private static int[] getNextArray(char[] str2) {
        //如果只有一个字符，人为规定返回 -1
        if(str2.length == 1){
            return new int[] {-1};
        }
        //定义一个长度与传进来字符数组一样长度的数组
        int[] next = new int[str2.length];
        next[0] = -1; //任何数组首元素 的next数组值 都为-1（人为规定的）
        next[1] = 0; //str2索引为1,前面只有一个元素，又规定 最大字符长度不能 取到它本身，所以是0
        int i = 2; //i表示目前在哪个位置上求 next数组的值 索引从2开始，
        int cn = 0; //跳跃指针
        while(i < next.length){
            if (str2[i-1] == str2[cn]){
                next[i++] = ++cn;
            }else if(cn>0){
                cn = next[cn];
            }else {//跳跃指针=0，字符数组中 没有 与i位置 相同的字符，自我匹配失败，所以为当前next数组 i位置的 值为0。
                next[i++] = 0;
            }
        }
        return next;
    }


}
