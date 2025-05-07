package rahulshettycourse;

public class ReverseString {

    public static void main (String [] args){
        String str = "Testing";
        String reverseString = "";

        for(int i = 0; i < str.length(); i++){
            reverseString = str.charAt(i) + reverseString;
        }
        System.out.println(reverseString);
    }




}
