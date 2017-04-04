public class Triangle_Exercises {
    public static String printAsterisk() {
        return "*";
    }

    public static String drawAhorizontalLine(int n) {
        String result = "";
        for(int i = 1; i <= n; i++) {
            result += printAsterisk();
        }
        return result;
    }

    public static String Draw_a_vertical_line(int n) {
        String result = "";
        for(int i = 1; i < n; i++) {
            result += printAsterisk()+"\n";
        }
        return result+printAsterisk();
    }
}
