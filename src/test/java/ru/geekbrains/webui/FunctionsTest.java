package ru.geekbrains.webui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FunctionsTest {
    Functions functions = new Functions();

    @Test
    @DisplayName("Число является четным")
    void isNumberEvenPositiveTest() {
        boolean result = functions.isNumberEven(4);
        Assertions.assertTrue(result, "Number is NOT Even");
    }

    @Test
    @DisplayName("Число является нечетным")
    void isNumberEvenNegativeTest() {
        boolean result = functions.isNumberEven(5);
        Assertions.assertFalse(result, "Number is Even");
    }

    @ParameterizedTest
    @DisplayName("Числа положительные")
    @ValueSource(ints = {10,0,-7})
    @Disabled("Disabled for example")
    void isNumberPositive(int number) {
        boolean result = functions.isPositive(number);
        Assertions.assertTrue(result);
    }
}
