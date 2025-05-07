package udemy;

public class DisplayDigits {
    public static void main(String [] args){
        int num = 24343;
        int reminder;
        while(num > 0){
            reminder = num % 10;
            num = num/10;
            System.out.println(reminder);
        }
    }
}
