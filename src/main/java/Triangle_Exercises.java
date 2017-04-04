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
}
