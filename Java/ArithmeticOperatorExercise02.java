//ArithmeticOperatorExercise02
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        int i = 1;
        i = ++i;
        /*
         * 先自增后赋值
         * i = i + 1;
         * temp = i;
         * i = temp;
         */
        System.out.println(i); // 2
    }
}