package udemy;

public class StringUrl {
    public static void main(String [] args){
        // http://www.google.com (Find start and end of the url)

        String url = "http://www.google.com";

       String protocol = url.substring(0, url.indexOf(":"));
        System.out.println(protocol);

        if(protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        }
        else{
            System.out.println("Error.......");
        }

        String ext = url.substring(url.lastIndexOf(".")+1);
        System.out.println(ext);
        if(ext.equals("com")){
            System.out.println("Commercial");
        }
        else{
            System.out.println("Error........");
        }
    }
}
