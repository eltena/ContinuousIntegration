import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest
{
    @Test
    public void fibtest1()
    {
        Assertions.assertEquals(1, Fibonacci.fibonacci(2));
    }
    @Test
    public void test2() {
        Assertions.assertEquals(4, Fibonacci.fibonacci(5));
    }

}
