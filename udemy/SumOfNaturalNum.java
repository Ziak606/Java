package udemy;

public class SumOfNaturalNum {
    public static void main(String [] args){
        /*
        0 + 1 = 1
        1 + 2 = 3
        3 + 3 = 6
        6 + 4 = 10
        sum + i = sum
         */

        int n = 10;
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum = sum + i;
            System.out.println((sum-i) + "+"+ i + "=" + sum);
        }
      //  System.out.println(sum);

    }
}
