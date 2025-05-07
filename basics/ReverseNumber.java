package basics;

public class ReverseNumber {

    public static void main(String [] args){

        String number = "1234";
        StringBuffer num  =  new  StringBuffer(number);

        num.reverse();
        System.out.println(num);

    }
}
