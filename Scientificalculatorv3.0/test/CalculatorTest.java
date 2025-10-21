import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 3);
        assertEquals(13, calc.add());
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 2);
        assertEquals(20, calc.add());
    }
}