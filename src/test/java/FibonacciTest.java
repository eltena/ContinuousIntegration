import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest
{
    @Test
    public void fibtest1() {
        Assertions.assertEquals(1, Fibonacci.fibonacci(2));
    }

}
