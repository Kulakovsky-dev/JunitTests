package ru.geekbrains.webui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    @Disabled("Disabled for example")
    void triangleSquareTest() {
        double c = Math.sqrt(2);
        double result = triangle.triangleSquare(1,1, c);
        Assertions.assertEquals(0.5,result, 0.001);
    }

    @CsvSource({
            "1, 1, 1, 0.433",
            "3, 4, 5, 6",
            "5, 4, 6, 9.9216",
            "1, 2, 3, 0"
    })
    @ParameterizedTest
    public void massTest(double a, double b, double c, double result) {
        Assertions.assertEquals(result, triangle.triangleSquare(a,b,c), 0.001);
    }
}
