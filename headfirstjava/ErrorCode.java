package headfirstjava;

public class ErrorCode {

        public static void main(String[] args)
        {
            for (int i = 0; i < 5; i--) {

                System.out.println("This loop will run forever");
            }
        }
    }
// Output: When you run the above code you will get TLE(Time Limit Exceeded) error.
