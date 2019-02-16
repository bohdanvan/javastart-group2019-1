/**
 * @author bvanchuhov
 */
public class HWAnalyze {

    public static void main(String[] args) {
        System.out.println(11 / 4);
        System.out.println(11 % 4);
        System.out.println(11.0 / 4);

        long a = 200; // 8B
        byte b = (byte) a; // 1B - bad practice
        System.out.println(b);

//        System.out.println(1 / 0);
        System.out.println("Bye");

        long x = 10_000_000_000L;
    }
}
