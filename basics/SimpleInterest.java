package basics;

public class SimpleInterest {

    public static void main(String [] args){

        float Principal = 10000;
        float Rate = 10;
        float Time = 5;

        float SI = (Principal * Rate * Time) / 100 ;

        System.out.println("Simple Interest : = " + SI);

    }
}
