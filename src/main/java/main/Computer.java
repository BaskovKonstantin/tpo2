package main;

import computing.Function;
import computing.log.*;
import computing.trig.Sin;

public class Computer extends Function {

    private final Sin sinFunc;
    private final Ln lnFunc;
    private final LogTenBase logTenBaseFunc;
    private final LogFiveBase logFiveBaseFunc;
    private final LogThreeBase logThreeBaseFunc;
    private final LogTwoBase logTwoBaseFunc;

    public Computer(double  accuracy,
                        Sin cotFunc,
                        Ln  lnFunc,
                        LogTenBase logTenBaseFunc,
                        LogFiveBase logFiveBaseFunc,
                        LogThreeBase logThreeBaseFunc,
                        LogTwoBase logTwoBaseFunc
                        )
    {
        super(accuracy);
        this.sinFunc = cotFunc;
        this.lnFunc = lnFunc;
        this.logTenBaseFunc = logTenBaseFunc;
        this.logFiveBaseFunc = logFiveBaseFunc;
        this.logThreeBaseFunc = logThreeBaseFunc;
        this.logTwoBaseFunc = logTwoBaseFunc;
    }

    @Override
    public double calculate(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x <= 0) {
            return
                    (sinFunc.calculate(x)*sinFunc.calculate(x));
        } else {
            return
                    Math.pow(((Math.pow(lnFunc.calculate(x), 3)/ lnFunc.calculate(x)) / (logFiveBaseFunc.calculate(x) + logTwoBaseFunc.calculate(x))) * Math.pow((logTwoBaseFunc.calculate(x) + Math.pow(lnFunc.calculate(x),2)),2), 3);
        }
    }
}
