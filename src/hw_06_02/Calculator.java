package hw_06_02;
/*  Написать калькулятор с использованием аннотаций, аннотация передает 2 параметра.
    Сделать полную документацию всех полей, методов, конструкторов класса используя аннотацию Documented,
    либо же документационные комментарии.
 */


/**
 * @author Sergey St
 * @version 1.0
 * @since 15.02.2023
 */

public class Calculator {
    /**
     * First variable
     */
    int number1;

    /**
     * Second variable
     */
    int number2;

    /**
     * Constructor without parameters
     */
    public Calculator() {
    }

    /**
     * The constructor initializes the two numbers needed for mathematical operations
     * @param number1 first variable
     * @param number2 second variable
     */
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    /**
     * get the value of the first variable
     * @return  first variable
     */
    public int getNumber1() {
        return number1;
    }

    /**
     * get the value of the second variable
     * @return  number2
     */
    public int getNumber2() {
        return number2;
    }

    /**
     * Addition operation
     * @return sum of addition
     */
    public int addition() {
        int add = this.number1 + this.number2;
        return add;
    }
    /**
     * Subtraction operation
     * @return subtraction difference
     */
    public int subtraction() {
        int subt = this.number1 - this.number2;
        return subt;
    }

    /**
     *Multiplication operation
     * @return product of two variables
     */
    public int multiply() {
        int mult = this.number1 * this.number2;
        return mult;
    }

    /**
     * Division operation
     * @return quotient of two variables
     */
    public int division() {
        int div = this.number1 / this.number2;
        return div;
    }

    /**
     *Object information
     * @return property description
     */
    @Override
    public String toString() {
        return "Calculator: " + " number1 = " + this.number1 + ", number2 = " + this.number2;
    }
}
