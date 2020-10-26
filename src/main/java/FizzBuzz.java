public class FizzBuzz {
    public String check(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        else if (having3(number) != null && having5(number) != null)
            return ("FizzBuzz");
        else if((number % 3 == 0  &&  having5(number) != null) )
            return ("FizzBuzz");
        else
            return String.valueOf(number);
    }

    public static Object having5(int num) {
        while (num > 0) {
            if (num % 10 == 5)
                return true;

            num = num / 10;
        }
        return null;
    }

    public static Object having3(int num) {
        while (num > 0) {
            if (num % 10 == 3)
                return true;

            num = num / 10;
        }
        return null;
    }
}
