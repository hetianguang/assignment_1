public class Prime_actors_Exercise {
    public static String generate(int n) {
        String result = "";
        if(n <= 1) {
            return null;
        }
        for(int i = 2; i < n; ){
            if(0 == n % i){
                n = n / i;
                result += String.valueOf(i)+",";
            } else {
                i++;
            }
        }
        result += String.valueOf(n);
        return result;
    }
}
