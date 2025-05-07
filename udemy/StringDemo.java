package udemy;

public class StringDemo {
    public static void main (String [] args){
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1);
      //  System.out.println(str2);
        String str="Knowledge";
        String s=str;
        str=str.concat(" Base");
        System.out.println(str);


        String s1 = "java";
        s1.concat(" rules");

        // Yes, s1 still refers to "java"
        System.out.println("s1 refers to " + s1);

        /*
        In object-oriented programming, the immutable string or objects that cannot be modified once it is created.
        But we can only change the reference to the object. We restrict to change the object itself.
         */


        /*
        The String is immutable in Java because of the security,
        synchronization and concurrency, caching, and class loading.
        The reason of making string final is to destroy the immutability and to not allow others to extend it.
         */
        //********************************************************//
        String str3 = new String("Java");
        System.out.println(str3);
    }
}
