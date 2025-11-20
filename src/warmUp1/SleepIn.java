package warmUp1;
//The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//
//sleepIn(false, false) → true
//sleepIn(true, false) → false
//sleepIn(false, true) → true
public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(sleepIn(false, false)); // true
        System.out.println(sleepIn(true, false));  // false
        System.out.println(sleepIn(false, true));  // true
        System.out.println(sleepIn(true, true));   // true
    }
}
