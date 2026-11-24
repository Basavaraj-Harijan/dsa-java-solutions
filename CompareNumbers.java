
class CompareNumbers {
    public static String compareNM(int n, int m) {
        if (n < m) {
            return "less";
        } else if (n == m) {
            return "equal";
        } else {
            return "greater";
        }
    }
}