package basics;

class Exercise1a {
    public static void main(String [] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
                System.out.println("small x");
            }
        }
    }
}



/*
Imagine This:

Classroom: Think of a class named Exercise1a as a special room where some magic happens.
Main Event: Inside this room, there's a main event called main where all the action starts.
Starting Point: We have a number x that starts at 5.
The Loop:

While Loop: Imagine you have a rule that says, "As long as x is more than 1, keep doing something."
Decreasing x: Each time you do something, you make x one smaller.
Check x: If x becomes less than 3, you shout "small x!"
Step-by-Step:

Start: x is 5.
First Round:
x becomes 4 (5 - 1).
Is x less than 3? No. So, nothing happens.
Second Round:
x becomes 3 (4 - 1).
Is x less than 3? No. So, nothing happens.
Third Round:
x becomes 2 (3 - 1).
Is x less than 3? Yes! So, you shout "small x!"
Fourth Round:
x becomes 1 (2 - 1).
Now, x is not more than 1, so you stop.
What Happens:

You only shout "small x!" once when x is 2.
 */