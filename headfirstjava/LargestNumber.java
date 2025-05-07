package headfirstjava;

public class LargestNumber {
    public static void main(String [] args){
        /*
        To find largest number 5,10,15
         */

        int a = 5, b = 10, c = 15;

        if(a > b && a > c){
            System.out.println("a is largest" + a);
        }
        else if(b > c){
            System.out.println("b is largest" + b);
        }
        else{
            System.out.println("c is largest" + c);
        }
    }
}
