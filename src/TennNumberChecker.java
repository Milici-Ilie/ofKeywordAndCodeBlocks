public class TennNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {

        return isTeen(a) || isTeen(b) || isTeen(c);


    }

    public static boolean isTeen(int a) {
        return (a > 12 && a < 20);
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(11, 44, 33));
//        System.out.println(isTeen(14));
    }
}
