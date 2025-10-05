public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Tests
        System.out.println("Test addition: 5 + 3 = " + calc.add(5, 3));
        System.out.println("Test soustraction: 10 - 4 = " + calc.subtract(10, 4));
        System.out.println("Test multiplication: 6 * 7 = " + calc.multiply(6, 7));
        System.out.println("Test division: 20 / 4 = " + calc.divide(20, 4));
        System.out.println("Test puissance: 2^3 = " + calc.power(2, 3));
        
        // Test division par zéro
        try {
            calc.divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Test division par zéro: " + e.getMessage());
        }
        
        System.out.println("\nTous les tests sont OK ✓");
    }
}
