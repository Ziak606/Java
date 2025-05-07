package com.pluralsight;

public class PrefixPostfix {
    public static void main (String [] args){
        int num1 = 5;
        /*
        Pre-increment/decrement − This form, increments/decrements the value first,
        and then performs the specified operation.
         */
        System.out.println(++num1);
        System.out.println(num1);

        /*
        Post-increment/decrement − This form, performs the specified operation first,
        and then increments/decrements the value.
         */
        int num2 = 5;
        System.out.println(num2++);
        System.out.println(num2);



    }
}
