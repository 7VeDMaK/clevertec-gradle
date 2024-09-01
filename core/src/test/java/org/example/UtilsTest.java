package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UtilsTest {


    static Stream<Arguments> positiveCases() {
        return Stream.of(
                Arguments.of((Object) new String[]{"12", "79"}),
                Arguments.of((Object) new String[]{"1"}),
                Arguments.of((Object) new String[]{"12"})
        );
    }


    static Stream<Arguments> negativeCases() {
        return Stream.of(
                Arguments.of((Object) new String[]{null, "12"}),
                Arguments.of((Object) new String[]{"", "-12"}),
                Arguments.of((Object) new String[]{"-1", "5"}),
                Arguments.of((Object) new String[]{null})
        );
    }

    @ParameterizedTest
    @MethodSource("positiveCases")
    public void testIsAllPositiveNumbers_PositiveCases(String[] numbers) {
        Utils utils = new Utils();
        assertTrue(utils.isAllPositiveNumbers(numbers));
    }

    @ParameterizedTest
    @MethodSource("negativeCases")
    public void testIsAllPositiveNumbers_NegativeCases(String[] numbers) {
        Utils utils = new Utils();
        assertFalse(utils.isAllPositiveNumbers(numbers));
    }
}
