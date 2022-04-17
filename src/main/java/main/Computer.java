package main;

import computing.Function;
import computing.log.Ln;
import computing.log.LogFiveBase;
import computing.log.LogTwoBase;
import computing.trig.Cot;

public class Computer extends Function {

    private final Cot cotFunc;
    private final Ln lnFunc;
    private final LogFiveBase logFiveBaseFunc;
    private final LogTwoBase logTwoBaseFunc;

    public Computer(double accuracy, Cot cotFunc, Ln lnFunc, LogFiveBase logFiveBaseFunc, LogTwoBase logTwoBaseFunc) {
        super(accuracy);
        this.cotFunc = cotFunc;
        this.lnFunc = lnFunc;
        this.logFiveBaseFunc = logFiveBaseFunc;
        this.logTwoBaseFunc = logTwoBaseFunc;
    }

    @Override
    public double calculate(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        if (x <= 0) {
            return cotFunc.calculate(x);
        } else {
            return Math.pow(((Math.pow(lnFunc.calculate(x), 3)/ lnFunc.calculate(x)) / (logFiveBaseFunc.calculate(x) + logTwoBaseFunc.calculate(x))) * Math.pow((logTwoBaseFunc.calculate(x) + Math.pow(lnFunc.calculate(x),2)),2), 3);
        }
    }
}
