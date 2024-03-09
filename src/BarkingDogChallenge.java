public class BarkingDogChallenge {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

            // if the hourOfDay is less than 0 or greater than 23, it's not
            // valid, so return false
            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }
            // if the dog is barking, and it's before 8am or after 10pm,
            // then you should wake up.
            return barking && (hourOfDay < 8 || hourOfDay > 22);

    }

    public static void main(String[] args) {
        boolean result = shouldWakeUp(true, 7);
        System.out.println(result);
    }
}
