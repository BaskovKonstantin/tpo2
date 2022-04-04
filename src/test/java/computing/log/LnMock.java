package computing.log;

import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LnMock {

    public static Ln getLnMock() {
        Ln lnFunction = mock(Ln.class);

        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.64645);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.24145347290444164);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.046117597181290375);
        when(lnFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.73973);
        when(lnFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.85725);
        when(lnFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.96183);
        when(lnFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.45182);
        when(lnFunction.calculate(Mockito.eq(10.0))).thenReturn(2.3025850929940);

        when(lnFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(Double.NaN);
        when(lnFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(Double.NaN);
        when(lnFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(lnFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(lnFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return lnFunction;
    }

    public static LogFiveBase getLogFiveBaseMock() {
        LogFiveBase logFiveBaseFunction = mock(LogFiveBase.class);

        when(logFiveBaseFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.93195);
        when(logFiveBaseFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.34809);
        when(logFiveBaseFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.06649);
        when(logFiveBaseFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(1.06643);
        when(logFiveBaseFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(1.23585);
        when(logFiveBaseFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(1.38662);
        when(logFiveBaseFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.65137);
        when(logFiveBaseFunction.calculate(Mockito.eq(10.0))).thenReturn(3.32022);

        when(logFiveBaseFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logFiveBaseFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logFiveBaseFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return logFiveBaseFunction;
    }

    public static LogTwoBase getLogTwoBaseMock() {
        LogTwoBase logTwoBaseFunction = mock(LogTwoBase.class);

        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(-0.40157);
        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(-0.14999);
        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.02865);
        when(logTwoBaseFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.45951);
        when(logTwoBaseFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.53252);
        when(logTwoBaseFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.59748);
        when(logTwoBaseFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(0.28067);
        when(logTwoBaseFunction.calculate(Mockito.eq(10.0))).thenReturn(1.43065);

        when(logTwoBaseFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.POSITIVE_INFINITY);
        when(logTwoBaseFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(logTwoBaseFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return logTwoBaseFunction;
    }
}
