package basics;

public class Exponent {
    /*output :- 1**2 = 1
                2**2 = 4
    */

    public static void main (String [] args){
        int num1 = 2;
        int num2 = calculateSquare(num1);
        System.out.println("The square of " + num1 + " is: " + num2);
    }
    public static int calculateSquare(int num1) {
        return num1 * num1;
    }
    //  int result = num1 ^ num2;
}
