public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double numar1, double numar2) {
        // Multiplică ambele numere cu 1000 pentru a le aduce la forma cu 3 zecimale
        int numar1Scaled = (int) (numar1 * 1000);
        int numar2Scaled = (int) (numar2 * 1000);

        // Verifică dacă numerele sunt egale după transformarea la 3 zecimale
        return numar1Scaled == numar2Scaled;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));    // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));          // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));     // false
    }
}