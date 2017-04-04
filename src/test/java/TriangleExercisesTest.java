import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleExercisesTest {

    @Test
    public void should_return_one_asterisk() {

        assertEquals(Triangle_Exercises.printAsterisk(),"*");
    }

    @Test
    public void print_n_asterisk_on_one_line_when_given_n_number() {
        int N = 8;

        assertEquals(Triangle_Exercises.drawAhorizontalLine(N),"********");
    }
}