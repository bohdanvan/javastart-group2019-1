/**
 * @author bvanchuhov
 */
public class CelsiusToFahrenheitConverter {

    public static void main(String[] args) {
        double celsius = 20;

        double fahrenheit = 1.8 * celsius + 32;

        System.out.println(celsius + " °C -> " + fahrenheit + " °F");
    }
}

// 20.0 °C -> 68.0 °F
// 0.0 °C -> 32.0 °F
// -10.0 °C -> 14.0 °F
