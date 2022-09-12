//ArithmeticOperatorExercise01
public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        /*
         * 先赋值后自增
         * temp = i;
         * i = i + 1;
         * i = temp;
         */
        System.out.println(i); //1

}
}