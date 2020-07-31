package net.codegen.practice.models;


//import static org.junit.jupiter.api.Assertions.*;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("MathUtills Test Running")
public class MathUtilssTest {

    MathUtils mathUtils;

    @BeforeAll//run before the instant of MathUtilssTest is created thtas why it is named static
    static void beforeAllInit() {
        System.out.println("run before the instant of MathUtilssTest is created");
    }

    @AfterAll//run before the instant of MathUtilssTest is created thtas why it is named static
    static void afterAllInit() {
        System.out.println("run after the instant of MathUtilssTest is terminated");
    }


    @BeforeEach
//run this before each @Test method
    void init() {
        mathUtils = new MathUtils();
    }

    @AfterEach
//run this after each @Test method
    void afterEach() {
        System.out.println("Clean up");
    }


    @Test//marks he method that you wants to run

    @DisplayName("Testing add method")
    void testAdd() {
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, () -> "Wrong Addition");
//        assertArrayEquals();
    }

    @Test
    @DisplayName("Testing Calculating circle area")
    void testCalculateCircleArea() {

        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Didnt success");

    }

    @Test
    @DisplayName("Testing divide method")
    void testDivide() {
        boolean isServerUp = true;
        assumeTrue(isServerUp);
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "Divide By zero should throw");
    }

    @Test
    @Disabled//when the test is in not developed
    @DisplayName("Test Driven")
    void disabledOnGoingTest() {
        fail("Testing on progress");
    }

    @Nested//Inside this class seperated nested are presented and kept
    @DisplayName("Multiply Method Testing")
    class Multi {

        @Test
        @DisplayName("Multipy Positive method")
        void multiplyPositve() {
            assertEquals(10, mathUtils.multiply(5, 2), "Should return the correct mul");
        }

        @Test
        @DisplayName("Multipy Positive method")
        void multiplyNegatives() {
            assertEquals(-10, mathUtils.multiply(-5, 2), "Should return the correct mul");
        }

        @Test
        @DisplayName("Multipy Positive method")
        void multiplyWithZero() {
            assertEquals(0, mathUtils.multiply(-5, 0), "Should return the correct mul");
        }

    }

    @Test
    @DisplayName("Substitute Method with assert All")
//if one is failed in assertEquals test is fail
    void substitute() {
        assertAll(
                () -> assertEquals(-10, mathUtils.substitute(-5, 5), "Get the correct Substitution"),
                () -> assertEquals(10, mathUtils.substitute(20, 10), "Get the correct Substitution")
        );
    }

}
