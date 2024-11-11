public class HarshadNumber {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    static boolean isHarshadNumber(int num) {
        int sum = digitSum(num);
        return num % sum == 0;
    }

   
    public static void main(String[] args) {
        System.out.println(isHarshadNumber(12)); // true
        System.out.println(isHarshadNumber(18)); // false
        System.out.println(isHarshadNumber(25)); // false
        System.out.println(isHarshadNumber(1729)); // true
    }
}