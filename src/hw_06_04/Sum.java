package hw_06_04;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Math{
    int num1() default 0;
    int num2() default 0;
}

public class Sum {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
