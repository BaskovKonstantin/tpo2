package computing.trig;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Cot tests")
public class CotTest {

    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    private Cot cotFunction;

    @BeforeEach
    void setup(){
        this.cotFunction = new Cot(ACCURACY, TrigMockFactory.getTanMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/trig/cot_test.csv")
    @DisplayName("Cot basic data tests")
    public void tableValuesStubsTest(double expected, double num, double den) {
        double actual = cotFunction.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Cot nan test")
    public void nanStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = cotFunction.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Cot positive infinity test")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = cotFunction.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Cot negative infinity test")
    public void negativeInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = cotFunction.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

}
