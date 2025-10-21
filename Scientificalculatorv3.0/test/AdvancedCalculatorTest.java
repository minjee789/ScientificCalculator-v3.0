import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedCalculatorTest {

    @Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 2);
        assertEquals(12, calc.add());
    }

    @Test
    void mod() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 2);
        assertEquals(0, calc.mod());
    }
}