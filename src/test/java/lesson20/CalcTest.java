package lesson20;

import lesson20.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CalcTest {
    private Calculator calc;

    @BeforeEach
    public void init() {
        calc = new Calculator();
    }

//    @CsvSource({
//            "2, 2, 4",
//            "-2, -2, -4",
//            "-2, 1, -1"
//    })

    public static Stream<Arguments> dataForTestAdd() {
        List<Arguments> out = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 1000);
            int b = (int) (Math.random() * 1000);
            int c = a + b;
            out.add(Arguments.arguments(a, b, c));
        }
        return out.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForTestAdd")
    public void massTestAdd(int a, int b, int result) {
        Assertions.assertEquals(result, calc.add(a, b));
    }

    @Test
    public void testSub() {
        Assertions.assertEquals(0, calc.sub(2, 2));
    }

    @Test
    public void testMul() {
        Assertions.assertEquals(9, calc.mul(3, 3));
    }
    @Test
    @Disabled
    public void testDiv() {
        Assertions.assertEquals(2, calc.div(10, 5));
    }
}
