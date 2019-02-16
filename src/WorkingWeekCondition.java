import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class WorkingWeekCondition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day (1..7): ");
        int day = scanner.nextInt();

        System.out.print("Is Ivan happy? (yes/no): ");
        boolean happy = scanner.next().equalsIgnoreCase("yes");

        // && - AND
        // || - OR
        // ! - NOT
        if (day <= 5) {
            if (day == 1 || day == 3 || day == 5) {
                System.out.println("Swimming Pool");
            }
            System.out.println("Work");
        } else {
            if (day == 7 && !happy) {
                System.out.println("Go to a cinema");
            }
            System.out.println("Friends");
        }

        System.out.println("Sport");
    }
}
