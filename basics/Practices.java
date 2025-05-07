package basics;

public class Practices {

    // Android
    // And###

    public static void main (String [] args){

        String str = "Android";

        StringBuilder sb = new StringBuilder(str);
        sb.replace(3,6, "###");

        System.out.println(sb);




    }
}
