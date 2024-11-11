public class HarshadMagicNumber {
    
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
    static boolean isHarshadMagicNumber(int num) {
        if (!isHarshadNumber(num)) return false;
        while (num > 9) {
            num = digitSum(num);
        }
        return num == 1;
    }

   

    public static void main(String[] args) {
        System.out.println(isHarshadMagicNumber(1729));//true
        System.out.println(isHarshadMagicNumber(1234));//false
    }
}
