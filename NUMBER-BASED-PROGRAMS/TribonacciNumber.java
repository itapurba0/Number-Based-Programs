public class TribonacciNumber {
    public static boolean isTribonacciNumber(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1, c = 1;
        int nextTerm = a + b + c;

        while (nextTerm <= num) {
            if (nextTerm == num) {
                return true;
            }
            a = b;
            b = c;
            c = nextTerm;
            nextTerm = a + b + c;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isTribonacciNumber(0)); // true
        System.out.println(isTribonacciNumber(1)); // true
        System.out.println(isTribonacciNumber(2)); // true
        System.out.println(isTribonacciNumber(3)); // false
        System.out.println(isTribonacciNumber(4)); // true
        System.out.println(isTribonacciNumber(5)); // false
        System.out.println(isTribonacciNumber(6)); // false
        System.out.println(isTribonacciNumber(7)); // true
    }
}
