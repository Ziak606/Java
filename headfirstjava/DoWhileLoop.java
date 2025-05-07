package headfirstjava;

public class DoWhileLoop {
    /*
    loop that prints numbers from 0 to 10 in a single line.
     */

    public static void main (String [] args){
        int x = 0;

        do{
            System.out.print(x + " ");
            x++;
        }
        while(x <= 10);
    }
}
