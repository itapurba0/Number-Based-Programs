public class DudeneyNumber {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    static boolean isDudeneyNumber(int num) {
        int sum = digitSum(num);
        int cubeRoot = (int) Math.round(Math.cbrt(num));
        return cubeRoot * cubeRoot * cubeRoot == num && sum == cubeRoot;
    }
    public static void main(String[] args) {
        System.out.println(isDudeneyNumber(512)); // true
        System.out.println(isDudeneyNumber(1000)); // false
        System.out.println(isDudeneyNumber(4913)); // true
    }
}