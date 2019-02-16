/**
 * @author bvanchuhov
 */
public class ForExample {

    public static void main(String[] args) {
        // n = 10...20
        for (int n = 10; n <= 20; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 40...30
        for (int n = 40; n >= 30; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 10, 20, 30, ... 100
        for (int n = 10; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();

        // n = 3000, 2900, 2800, ... 0
        int count = 0;
        for (int n = 3000; n >= 0; n -= 100) {
            System.out.print(n + " ");
            count++;
        }
        System.out.println();
        System.out.println("count = " + count);
    }
}
