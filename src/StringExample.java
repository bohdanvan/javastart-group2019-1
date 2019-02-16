/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello, Java!";

        int len = s.length(); // method
        System.out.println("len = " + len); // 11

        // Input: index, Output: char
        char ch = s.charAt(5);
        System.out.println(ch); // e

        // Practice:
        // 1. Перевести s в верхний регистр (toUpperCase)
        // "Hello, Java" -> "HELLO, JAVA"
        System.out.println(s.toUpperCase());

        // 2. Определить позицию слова "Java" в s
        // "Hello, Java" -> 7
        int index = s.indexOf("Java");
        System.out.println(index);

        // 3. Определить, начинается ли s со слова Hello?
        // "Hello, Java" -> true
        boolean startsWithHello = s.startsWith("Hello");
        System.out.println(startsWithHello);

        //--------
        char lastChar = s.charAt(s.length() - 1);
        System.out.println(lastChar); // "!"

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);
    }
}
