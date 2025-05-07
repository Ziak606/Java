package udemy;

public class RevserseNumber {
    
    public static void main(String [] args){

        int number = 237;
        int reverseNumber = 0;
        int reminder;

        while(number > 0) {
            reminder = number % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            number = number / 10;
        }
        System.out.println(reverseNumber);
    }
    
}
