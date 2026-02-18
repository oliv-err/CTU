package cz.cvut.fel.ts1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    @Test
    void factorialCorrect() {
        Factorial base = new Factorial();
        int res = base.factorial(6);
        assertEquals(720, res);
    }

    @Test
    void negativeInputReturnsMinusOne(){
        Factorial base = new Factorial();
        int res = base.factorial(-2);
        assertEquals(-1, res);
    }

    @Test
    void zeroInputReturnsOne(){
        Factorial base = new Factorial();
        int res = base.factorial(0);
        assertEquals(1, res);
    }
}