import org.junit.Test;

import static org.junit.Assert.*;

public class Diamond_ExercisesTest {

    @Test
    public void given_a_number_n_print_a_centered_triangle() {
        int N =3;
        String expectString = "  *"+"\n"+" ***"+"\n" + "*****\n";

        assertEquals(Diamond_Exercises.printIsoscelesTriangle(N),expectString);
    }

    @Test
    public void given_a_number_n_print_centered_diamond() {
        int N =3;
        String expectString = "  *"+"\n"+" ***"+"\n" + "*****\n"+ " ***\n" + "  *\n";

        assertEquals(Diamond_Exercises.diamond(N),expectString);
    }

    @Test
    public void given_a_number_n_print_a_centered_diamond_with_your_name_in_place_of_the_middle_line() {
        int N =3;
        String expectString = "  *"+"\n"+" ***"+"\n" + "bill\n"+ " ***\n" + "  *\n";

        assertEquals(Diamond_Exercises.Diamond_with_Name(N),expectString);
    }

}