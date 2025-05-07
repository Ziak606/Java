package com.pluralsight;

public class ForLoop {
    /*
    When you know exactly how many times you want to loop through a block of code,
    use the for loop instead of a while loop:
     */
    /*
    Java for loop provides a concise way of writing the loop structure.
    The for statement consumes the initialization, condition, and increment/decrement in one line thereby providing a shorter,
    easy-to-debug structure of looping.
     */
    /*
    Statement 1 is executed (one time) before the execution of the code block.

    Statement 2 defines the condition for executing the code block.

    Statement 3 is executed (every time) after the code block has been executed.
    --------------------------------------------------------------------------------
    Statement 1 sets a variable before the loop starts (int i = 0).

    Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.

    Statement 3 increases a value (i++) each time the code block in the loop has been executed.
     */
    public static void main(String [] args){
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
    }
}
