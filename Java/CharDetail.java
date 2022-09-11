//CharDetail.java
public class CharDetail {
    public static void main(String[] args) {
        char c1 = 'a';  //单个字符必须用单引号
        char c2 = 98;   //Java中，char的本质是一个整数，在输出时是unicode码对应的字符
        char c3 = 'b'+8; //Java中char类型是可以计算的
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println((int)c1);    //Java中char类型可以转义，因为其本质是整数
        System.out.println('a' + 10);
        System.out.println("a" + 10);   //单双引号的区别
    }
}