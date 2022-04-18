package main;

import computing.log.Ln;
import computing.log.LnMockFactory;
import computing.log.LogFiveBase;
import computing.log.LogTwoBase;
import computing.trig.*;
import org.junit.jupiter.api.AfterAll;
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

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void lnStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Cot cotFunction = new Cot(ACCURACY, tanFunction);
        Ln lnFunction = LnMockFactory.getLnMock();
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, cotFunction, lnFunction, logFiveBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void sinStubTest(double expected, double num, double den) {
        Sin sinFunction = TrigMockFactory.getSinMock();
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Cot cotFunction = new Cot(ACCURACY, tanFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, cotFunction, lnFunction, logFiveBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void cosStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = TrigMockFactory.getCosMock();
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Cot cotFunction = new Cot(ACCURACY, tanFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, cotFunction, lnFunction, logFiveBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void tanStubTest(double expected, double num, double den) {
        Tan tanFunction = TrigMockFactory.getTanMock();
        Cot cotFunction = new Cot(ACCURACY, tanFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, cotFunction, lnFunction, logFiveBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void cotStubTest(double expected, double num, double den) {
        Cot cotFunction = TrigMockFactory.getCotMock();
        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, cotFunction, lnFunction, logFiveBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void logTwoStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Cot cotFunction = new Cot(ACCURACY, tanFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = LnMockFactory.getLogTwoBaseMock();
        LogFiveBase logFiveBase = new LogFiveBase(ACCURACY, lnFunction);
        computer = new Computer(ACCURACY, cotFunction, lnFunction, logFiveBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/main/computer_test.csv")
    public void logFiveStubTest(double expected, double num, double den) {
        Sin sinFunction = new Sin(ACCURACY);
        Cos cosFunction = new Cos(ACCURACY, sinFunction);
        Tan tanFunction = new Tan(ACCURACY, sinFunction, cosFunction);
        Cot cotFunction = new Cot(ACCURACY, tanFunction);
        Ln lnFunction = new Ln(ACCURACY);
        LogTwoBase logTwoBase = new LogTwoBase(ACCURACY, lnFunction);
        LogFiveBase logFiveBase = LnMockFactory.getLogFiveBaseMock();
        computer = new Computer(ACCURACY, cotFunction, lnFunction, logFiveBase, logTwoBase);
        double actual = computer.calculate(num * Math.PI / den);
        assertEquals(expected, actual, DELTA);
    }
}
