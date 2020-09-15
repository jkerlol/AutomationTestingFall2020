
public class Foo {
    /* HW ASSIGNMENT:
     *
     * Part 1:
     *
     * - Use the calculator class to create a calculator object
     * - Now use the addition, subtraction, multiplication, and division methods on your new object and
     * - using the add method, add 2 numbers whose sum is 10
     * - using the subtract method, subtract 2 numbers whose difference is 5
     * - using the divide method, divide 2 numbers whose quotient is 2
     * - using the multiply method, multiply 2 numbers whose product is 24
     *
     * - Print all answers to your console
     *
     * Part 2:
     *
     * - Call the introduction method (defined below your main method) to print an introduction with your name!
     *
     */

    public static void main (String args[]) {

        Calculator calc = new Calculator();
        Foo ex = new Foo();

        System.out.println(ex.introduction("mohammed"));

        System.out.println("The answer to number 1 is " + calc.add(8,2));
        System.out.println("The answer to number 2 is " + calc.add(10,15));
        System.out.println("The answer to number 3 is " + calc.add(10,3));
        System.out.println("The answer to number 4 is " + calc.add(8,4));


    }



    public String introduction (String name) {

        String result = "";

        result = "Hi my name is " + name + ", it's a pleasure to meet you!";

        return result;
    }
}
