import computing.trig.Sin;

public class Main {
    public static void main(String[] args) {
        Sin sin = new Sin(0.0001);
        System.out.println(sin.calculate((1*Math.PI) / 6));
    }
}
