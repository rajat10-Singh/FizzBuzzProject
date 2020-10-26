import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTests {

    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”

    private FizzBuzz fizzbuzz;

    @Before
    public void object(){
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void testNumbers(){
        Assert.assertEquals("1", fizzbuzz.check(1));
        Assert.assertEquals("2", fizzbuzz.check(2));
    }

    @Test
    public void testFizzAndMultiplesOf3(){
        Assert.assertEquals("Fizz", fizzbuzz.check(3));
        Assert.assertEquals("Fizz", fizzbuzz.check(6));
    }

    @Test
    public void testFizzAndMultiplesOf5(){
        Assert.assertEquals("Buzz", fizzbuzz.check(5));
        Assert.assertEquals("Buzz", fizzbuzz.check(10));
    }
}
