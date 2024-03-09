
public class speedConverterChallenge{
    // write code here
    public static long toMilesPerHour(double kilometerPerHour) {

        if (kilometerPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometerPerHour/1.609);
        }
    }

    public static void printConversion(double kilometerPerHour) {

        long milesPerHour = toMilesPerHour(kilometerPerHour);
        if (milesPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args){
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }

}