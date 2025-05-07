package rahulshettycourse;

public class Methods {
    int a = 5;
    public void getData(){
        System.out.println("I'm inside the first method");
    }



    // Objects are the instances of class

    public static void main (String [] args){
        System.out.println("Hello....");
        Methods m = new Methods();
        m.getData();
        System.out.println(m.a);
        SecondMethod m2 = new SecondMethod();
        m2.setData();
    }
}
