package hw_06_04;
/*  Создать свою аннотацию, которая будет содержать параметры для метода, выполнить сложение 2-х чисел.
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2)
*/

import java.lang.reflect.Method;

public class Mathematics {
    public static void main(String[] args) {

        Sum numbers = new Sum();
        Class<?> cls = numbers.getClass();

        try{
            Method method = cls.getMethod("mathSum", int.class, int.class);
            Math var = method.getAnnotation(Math.class);
            numbers.mathSum(var.num1(), var.num2());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
