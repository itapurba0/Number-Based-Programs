public class SpyNumber {
    public static boolean isSpyNumber(int num) {
        int sum = 0;
        int product = 1;
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return (sum == product && num != 0);
    }
    public static void main(String[] args) {
        System.out.println(isSpyNumber(123));//true
        System.out.println(isSpyNumber(22));//true
        System.out.println(isSpyNumber(112));//false
        System.err.println(isSpyNumber(0));//false
    }
}
