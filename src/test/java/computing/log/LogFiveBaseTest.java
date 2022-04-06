package computing.log;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("LogFiveBase tests")
public class LogFiveBaseTest {
    private static final double DELTA = 0.05;
    public static final double ACCURACY = 0.001;

    private LogFiveBase logFiveBase;

    @BeforeEach
    void setup(){
        this.logFiveBase = new LogFiveBase(ACCURACY, LnMockFactory.getLnMock());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/computing/log/log5_test.csv")
    @DisplayName("LogFive test data from table")
    public void tableValuesTest(double expected, double num, double den) {
        double actual = logFiveBase.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test nan")
    public void nanStubsTest() {
        double expected = Double.NaN;
        double actual = logFiveBase.calculate(Double.NaN);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test positive infinity")
    public void positiveInfinityStubsTest() {
        double expected = Double.POSITIVE_INFINITY;
        double actual = logFiveBase.calculate(Double.POSITIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Test negative infinity")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = logFiveBase.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
