package computing.log;

public class Main {

    public static void main(String[] args) {
        Ln ln = new Ln(0.001);
        LogTwoBase lg = new LogTwoBase(0.001, ln);
        System.out.println(lg.calculate(1 * Math.PI / 6));
        System.out.println(lg.calculate(1 * Math.PI / 4));
        System.out.println(lg.calculate(1 * Math.PI / 3));
        System.out.println(lg.calculate(2 * Math.PI / 3));
        System.out.println(lg.calculate(3 * Math.PI / 4));
        System.out.println(lg.calculate(5 * Math.PI / 6));
        System.out.println(lg.calculate(1 * Math.PI / 2));
        System.out.println(lg.calculate(10.0));
        System.out.println(lg.calculate(Double.POSITIVE_INFINITY));
        System.out.println(lg.calculate(Double.NEGATIVE_INFINITY));
        System.out.println(lg.calculate(Double.NaN));

//        when(logFiveBaseFunction.calculate(Mockito.eq(1 * Math.PI / 4)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(1 * Math.PI / 3)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(2 * Math.PI / 3)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(3 * Math.PI / 4)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(5 * Math.PI / 6)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(1 * Math.PI / 2)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(10.0)));
//
//        when(logFiveBaseFunction.calculate(Mockito.eq(-1 * Math.PI / 2)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(-1 * Math.PI / 4)));
//        when(logFiveBaseFunction.calculate(Mockito.eq(-3 * Math.PI / 4)));
//        when(logFiveBaseFunction.calculate(Double.POSITIVE_INFINITY));
//        when(logFiveBaseFunction.calculate(Double.NEGATIVE_INFINITY));
//        when(logFiveBaseFunction.calculate(Double.NaN));



    }
}
