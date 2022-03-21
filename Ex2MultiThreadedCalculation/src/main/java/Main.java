import java.math.BigInteger;

public class Main {

    public static void main (String[] args) throws InterruptedException {
        System.out.println("hi world");
        ComplexCalculation c = new ComplexCalculation();
        BigInteger x = c.calculateResult(BigInteger.valueOf(100),BigInteger.valueOf(100), BigInteger.valueOf(100),BigInteger.valueOf(100) );
        System.out.println(x);
    }
}
