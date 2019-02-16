/**
 * @author bvanchuhov
 */
public class BooleanExample {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;

        boolean b3 = 10 < 20; // true

        int x = 100;
        boolean b4 = x >= 150; // false

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        System.out.println(x > 70); // true
        System.out.println(x >= 100); // true
        System.out.println(x < 10); // false
        System.out.println(x <= 200); // true
        System.out.println(x == 300); // false
        System.out.println(x != 300); // true
     }
}
