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

    @Test
    public void Given_a_number_n_and_print_n_lines_each_with_one_asterisks() {
        int N = 3;

        assertEquals(Triangle_Exercises.Draw_a_vertical_line(N),"*\n*\n*");
    }

    @Test
    public void Given_a_number_n_print_n_lines_each_with_one_more_asterisk_than_the_last() {
        int N = 3;

        assertEquals(Triangle_Exercises.DrawaRightTriangle(N),"*\n**\n***");
    }
}