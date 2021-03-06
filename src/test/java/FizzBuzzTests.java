import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTests {

    // Write a program that prints the numbers from 1 to 100.
    // But for multiples of three print “Fizz” instead of the number
    // and for the multiples of five print “Buzz”.
    // For numbers which are multiples of both three and five print “FizzBuzz”
    /* Stage 2:
        A number is a Fizz if it is divisible by 3 or if it has 3 in it.
        A number is a Buzz if it is divisible by 5 or if it has 5 in it.
     */

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

//    @Test
//    public void testFizzAndMultiplesOf3(){
//        Assert.assertEquals("Fizz", fizzbuzz.check(3));
//        Assert.assertEquals("Fizz", fizzbuzz.check(6));
//    }
//
//    @Test
//    public void testFizzAndMultiplesOf5(){
//        Assert.assertEquals("Buzz", fizzbuzz.check(5));
//        Assert.assertEquals("Buzz", fizzbuzz.check(10));
//    }

    @Test
    public void testFizzBuzzMultiplesOfBoth3And5(){
        Assert.assertEquals("FizzBuzz", fizzbuzz.check(15));
    }

    @Test
    public void testNumberHavingBy3And5Both(){
        Assert.assertEquals("FizzBuzz", fizzbuzz.check(53));
        Assert.assertEquals("FizzBuzz", fizzbuzz.check(35));
    }

    @Test
    public void testNumberDivisibleBy3AndHaving5(){
        Assert.assertEquals("FizzBuzz", fizzbuzz.check(54));
        Assert.assertEquals("FizzBuzz", fizzbuzz.check(45));
    }

    @Test
    public void testNumberDivisibleBy5AndHaving3(){
        Assert.assertEquals("FizzBuzz", fizzbuzz.check(35));
    }

    @Test
    public void testNumberDivisibleBy3AndHaving3(){
        Assert.assertEquals("Fizz", fizzbuzz.check(36));
    }

    @Test
    public void testNumberDivisibleBy5AndHaving5(){
        Assert.assertEquals("Buzz", fizzbuzz.check(25));
    }
}
