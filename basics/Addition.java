package basics;

public class Addition {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int sum = add(num1, num2);
        int sum1 = sub(num1, num2);
        int sum2 = mul(num1, num2);
        int sum3 = div(num1, num2);

        System.out.println("Sum : " + sum);
        System.out.println("Sub : " + sum1);
        System.out.println("Mul : " + sum2);
        System.out.println("Div : " + sum3);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        return num1 / num2;
    }

}
