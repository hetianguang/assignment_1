public class Diamond_Exercises {
    public static String printIsoscelesTriangle(int n) {
        String result = "";
        for(int i = 0; i < n; i++) {
            for(int j = n-1-i; j > 0; j--) {
                result += " ";
            }
            for(int k = 0; k < 2*i +1; k++) {
                result += "*";
            }
            result += "\n";
        }
        return result;
    }

    public static String diamond(int n) {
        String result = "";
        for(int i = 0; i < n; i++) {
            for(int j = n-1-i; j > 0; j--) {
                result += " ";
            }
            for(int k = 0; k < 2*i +1; k++) {
                result += "*";
            }
            result += "\n";
        }
        for(int i = n-2; i >=0; i--) {
            for(int j = n-1-i; j > 0; j--) {
                result += " ";
            }
            for(int k = 0; k < 2*i +1; k++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);
        return result;
    }

    public static String Diamond_with_Name(int n) {
        String result = "";
        for(int i = 0; i < n-1; i++) {
            for(int j = n-1-i; j > 0; j--) {
                result += " ";
            }
            for(int k = 0; k < 2*(i) +1; k++) {
                result += "*";
            }
            result += "\n";
        }
        result += "bill\n";
        for(int i = n-2; i >=0; i--) {
            for(int j = n-1-i; j > 0; j--) {
                result += " ";
            }
            for(int k = 0; k < 2*i +1; k++) {
                result += "*";
            }
            result += "\n";
        }
        System.out.println(result);
        return result;
    }
}
