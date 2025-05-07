package udemy;

import java.util.Scanner;

public class SwitchCaseWebType {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Domain Name");
        String webUrl = sc.nextLine();
        String ext = webUrl.substring(webUrl.lastIndexOf(".")+1);
       // System.out.println(ext);
        switch(ext){
            case "com": System.out.println("Commercial");
                break;
            case "org": System.out.println("Organisation");
                break;
            case "gov": System.out.println("Government");
                break;
            case "co":  System.out.println("Company");
                break;

            default: System.out.println("Invalid URL");
        }

    }
}
