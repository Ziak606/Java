package basics;

public class TemperatureConversion {
    /*
     * Create a program that converts a temperature from Celsius to Fahrenheit and vice versa.
     * (Degree * 9/5) + 32
     */
    public static void main (String[] args){

        float degree = 93.4f;
        float fahrenheit = (degree * 9/5) + 32;

        System.out.println(fahrenheit);

        if(fahrenheit >= 200 ){
            System.out.println("Alert Warning!!!!");
        }
        else{
            System.out.println("Everything Is Alright!!!");
        }
    }
}
