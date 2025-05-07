package udemy;

public class Factorial {
    /*
    1 x 1 = 1
    1 x 2 = 2
    2 x 3 = 6
    6 x 4 = 24
    24 x 5 = 120

    fact = fact * i;
     */
    public static void main(String [] args){

        int n = 5;
        int fact = 1;

        for(int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.println(fact);
        }

    }


}
