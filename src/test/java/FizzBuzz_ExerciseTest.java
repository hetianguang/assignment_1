import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzz_ExerciseTest {

    @Test
    public void should_return_a_number_when_input_a_number() {
        int N = 1;

        assertEquals(FizzBuzz_Exercise.fizzBizz(N),"1");
    }

    @Test
    public void Instead_of_numbers_divisible_by_three_print_Fizz() {
        int N = 3;

        assertEquals(FizzBuzz_Exercise.fizzBizz(N),"Fizz");
    }

    @Test
    public void Instead_of_numbers_divisible_by_five_print_Bizz() {
        int N = 5;

        assertEquals(FizzBuzz_Exercise.fizzBizz(N),"Bizz");
    }

    @Test
    public void Instead_of_numbers_divisible_by_three_and_five_print_Bizz() {
        int N = 15;

        assertEquals(FizzBuzz_Exercise.fizzBizz(N),"FizzBizz");
    }
}