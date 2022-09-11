
/*
 * 基本数据类型
 *  数据型
 *      整数类型
 *          byte 1
 *          short 2
 *          int 4
 *          long 8
 *      浮点类型
 *          float 4
 *          double 8
 *  字符型
 *      char 2 //存放单个字符
 *  布尔型
 *      boolean 1 //存放 true/false
 */

 //String 不是基本数据类型，是class


public class Var03 {
    public static void main(String[] args) {
        byte n1 = 1;
        short n2 = 2;
        int n4 = 4;
        long n8 = 8;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n4);
        System.out.println(n8);

    }
}


class FloatDetail{
    public static void main(String[] args) {
        float num1 = 1.1F;//定义float类型要后缀F
        double num2 = 1.2;
        System.out.println(num1);
        System.out.println(num2);
        //科学计数法
        double num3 = 5.12e2;   //5.12*10^2 = 512.0
        double num4 = 5.12e-2;  //5.12*10^-2 = 0.0512
        System.out.println(num3);
        System.out.println(num4);
    }
}