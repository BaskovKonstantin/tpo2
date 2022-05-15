package computing.trig;

import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TrigMockFactory {

    public static Sin getSinMock() {
        Sin sinFunction = mock(Sin.class);

        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 6))).thenReturn(0.49999999999999994);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 4))).thenReturn(0.7071067811865475);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 3))).thenReturn(0.8660254037844386);
        when(sinFunction.calculate(Mockito.eq(2 * Math.PI / 3))).thenReturn(0.8660254037844387);
        when(sinFunction.calculate(Mockito.eq(3 * Math.PI / 4))).thenReturn(0.7071067811865476);
        when(sinFunction.calculate(Mockito.eq(5 * Math.PI / 6))).thenReturn(0.49999999999999994);
        when(sinFunction.calculate(Mockito.eq(1 * Math.PI / 2))).thenReturn(1.0);
        when(sinFunction.calculate(Mockito.eq(-1 * Math.PI / 2))).thenReturn(-1.0);
        when(sinFunction.calculate(Mockito.eq(-1 * Math.PI / 4))).thenReturn(-0.7071067811865475);
        when(sinFunction.calculate(Mockito.eq(-3 * Math.PI / 4))).thenReturn(-0.7071067811865476);


        when(sinFunction.calculate(Double.POSITIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.calculate(Double.NEGATIVE_INFINITY)).thenReturn(Double.NaN);
        when(sinFunction.calculate(Double.NaN)).thenReturn(Double.NaN);

        return sinFunction;
    }



}
