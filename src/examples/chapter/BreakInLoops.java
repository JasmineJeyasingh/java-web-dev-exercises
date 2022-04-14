package examples.chapter;

public class BreakInLoops {
    public static void main(String [] args) {
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                break; //If the break statement weren’t there, the loop would continue and when it found the second 10,
                       // it would print “Found it!” a second time.
            }
        }
    }
}
