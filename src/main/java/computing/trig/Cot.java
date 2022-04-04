package computing.trig;

import computing.Function;

public class Cot extends Function {

    private final Tan tanFunc;

    public Cot(double accuracy, Tan tanFunc) {
        super(accuracy);
        this.tanFunc = tanFunc;
    }

    @Override
    public double calculate(double x) {
        double cot = 1 / tanFunc.calculate(x);
        return Double.isFinite(cot) ? cot : Double.POSITIVE_INFINITY;
    }

}
