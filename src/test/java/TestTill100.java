import org.junit.Test;

public class TestTill100 {
    @Test
    public void printTill100(){
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++){
            System.out.println(fizzbuzz.check(i));
        }
    }
}
