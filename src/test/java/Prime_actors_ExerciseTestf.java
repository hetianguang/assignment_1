import org.junit.Test;

import static org.junit.Assert.*;

public class Prime_actors_ExerciseTestf {
    @Test
    public void should_return_empty_when_input_1() {

        int N = 1;

        assertEquals(Prime_actors_Exercise.generate(N),null);
    }

    @Test
    public void should_return_235_when_input_30() {

        int N = 30;

        assertEquals(Prime_actors_Exercise.generate(N),"2,3,5");
    }

}