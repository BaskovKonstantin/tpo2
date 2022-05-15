package main;

import computing.log.*;
import computing.trig.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputerTest {
    private static final double DELTA = 0.05;
    private static final double ACCURACY = 0.001;

    static Computer computer;

    @AfterAll
    static void logInCSV() {
        CsvLogger csvLogger = new CsvLogger("computer_result.csv");
        csvLogger.log(computer);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void allStubsTest(double expected, double num, double den) {
        computer = new Computer(ACCURACY,
                TrigMockFactory.getSinMock(),
                LnMockFactory.getLnMock(),
                LnMockFactory.getLogTenBaseMock(),
                LnMockFactory.getLogFiveBaseMock(),
                LnMockFactory.getLogThreeBaseMock(),
                LnMockFactory.getLogTwoBaseMock());
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void lnStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);

        Ln lnFunction = LnMockFactory.getLnMock();
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, sinFunction, lnFunction, logTenBase, logFiveBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void sinStubTest(double expected, double num, double den) {
        Sin sinFunction = TrigMockFactory.getSinMock();

        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, sinFunction, lnFunction, logTenBase, logFiveBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void logTwoStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);

        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, sinFunction, lnFunction, logTenBase, logFiveBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void logFiveStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);

        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogThreeBase logThreeBase = new LogThreeBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        LogTenBase logTenBase = new LogTenBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, sinFunction, lnFunction, logTenBase, logFiveBase, logThreeBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }
}
