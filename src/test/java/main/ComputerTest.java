package main;

import computing.log.LnMockFactory;
import computing.trig.Cos;
import computing.trig.TrigMockFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    static Computer computer;

    @AfterAll
    static void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("output/computer_result.csv");
        csvLogger.log(computer);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void allStubsTest(double expected, double num, double den) {
        computer = new Computer(ACCURACY, TrigMockFactory.getCotMock(), LnMockFactory.getLnMock(), LnMockFactory.getLogFiveBaseMock(), LnMockFactory.getLogTwoBaseMock());
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @Test
    @DisplayName("Cos negative infinity test")
    public void negativeInfinityStubsTest() {
        double expected = Double.NaN;
        double actual = computer.calculate(Double.NEGATIVE_INFINITY);
        assertEquals(expected, actual, DELTA);
    }
}
