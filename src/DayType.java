import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class DayType {

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = scan.nextInt();

        // BL + Output
        if (day <= 5) {
            System.out.println("weekday");
        } else {
            System.out.println("weekend");
        }
    }
}
