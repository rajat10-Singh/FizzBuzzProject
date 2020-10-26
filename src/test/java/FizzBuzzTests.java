import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTests {

    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”

    @Test
    public void testNumbers(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        Assert.assertEquals("1", fizzbuzz.check(1));
        Assert.assertEquals("2", fizzbuzz.check(2));
    }
}
