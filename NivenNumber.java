public class NivenNumber {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    static boolean isNivenNumber(int num) {
        int sum = digitSum(num);
        return num % sum == 0;
    }
    public static void main(String[] args) {
        System.out.println(isNivenNumber(18)); // true
        System.out.println(isNivenNumber(17)); // false
        System.out.println(isNivenNumber(24)); // true
    }
}