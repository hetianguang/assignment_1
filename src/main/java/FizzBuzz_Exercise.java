public class FizzBuzz_Exercise {
    public static String fizzBizz(int n) {

        if(n%15 == 0) {
            return "FizzBizz";
        }
        if(n%3 == 0) {
            return "Fizz";
        }
        if(n%5 == 0) {
            return "Bizz";
        }
        return String.valueOf(n);
    }
}
