package udemy;

public class CountDigits {
    /*
    1234
    1234/10 = 123
    123/10 = 12
    12/10 = 1
    1/10 = 0
     */
    public static void main(String [] args){
        int n = 123;
        int count = 0;

        while(n > 0){
            n = n/10;
            count ++;
        }
        System.out.println(count);
    }
}
