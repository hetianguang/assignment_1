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

    public static String DrawaRightTriangle(int n) {
        String result = "";
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) {
            result += printAsterisk();
            }
            if(i == n) {
                return result;
            }
            result += "\n";
        }
        return result;
    }
}
