
    //arithmetic operator
public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println(10 / 4); //java中10和4均为整数，以整数形式输出2
        System.out.println(10.0 / 4.0); //以浮点形式输出2.5
        double d = 10 / 4;  // 10与4均为整数，计算结果也为整数，赋给浮点类型，结果为2.0
        System.out.println(d);
        System.out.println("\n");

        //取模的使用 公式:      a % b = a - a / b * b
        System.out.println(10%3);   //1     10-10/3*3 = 10-3*3 = 10-9 = 1
        System.out.println(-10%3);  //-1    -10+10/3*3 = -10+3*3 = -10+9 = -1
        System.out.println(10%-3);  //1 
        System.out.println("\n");

        //自增自减
        int i = 10;
        i++; // i = i + 1
        System.out.println(i);
        i = 10;
        int a = ++i;    //先自增后赋值 i=i+1; a=i;
        System.out.println(a); //11
        i = 10;
        int b = i++;    //先赋值后自增 b=i; i=i+1;
        System.out.println(b);  //10


    }
}