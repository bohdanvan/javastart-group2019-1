/**
 * @author bvanchuhov
 */
public class VariableTypes {

    public static void main(String[] args) {
        // Primitive types (8)
        // 1. Integer types (4)
        byte b = 100; // 1B, -128...127
        short s = 10000; // 2B, -32 000 ... +32 000
        int x = 100000000; // default, 4B, -2 000 000 000 ... +2 000 000 000
        long l = 1000000000000000000L; // 8B, 18 digits

        // 2. Floating point types (2)
        float f = 10.5f;
        double d = 10.5; // default

        // 3. Character (1)
        char c = 'a';

        // 4. Logical (1)
        boolean bool = true; // true/false

        // Object types
        String str = "Java";
    }
}
