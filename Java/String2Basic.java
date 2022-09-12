
public class String2Basic {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "4.5";
        int num1 = Integer.parseInt(s1);            //将字符串转换为int
        double num2 = Double.parseDouble(s2);       //将字符串转换为double
        boolean b = Boolean.parseBoolean("true");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(b);

        System.out.println(s1.charAt(0)); //将s1字符串的第一个字符作为char类型输出

    }
}