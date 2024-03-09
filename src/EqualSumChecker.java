public class EqualSumChecker {

    public static boolean hasEqualSum(int first, int second, int third) {

//        return (a + b) == c; --- this is a more simple method

        if (first + second == third) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        boolean result = hasEqualSum(1,-1,0);
        System.out.println(result);
    }
}
