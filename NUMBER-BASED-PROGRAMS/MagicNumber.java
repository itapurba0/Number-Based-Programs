public class MagicNumber {
    public static boolean isMagicNumber(int number) {
        while (number > 9) {
            number = sumOfDigits(number);
        }
        return number == 1;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isMagicNumber(0));//false
        System.out.println(isMagicNumber(1));//true
        System.out.println(isMagicNumber(12));//false
        System.out.println(isMagicNumber(123));//false
        System.out.println(isMagicNumber(1234));//true
        System.out.println(isMagicNumber(12345));//false
        System.out.println(isMagicNumber(123456));//false
        System.out.println(isMagicNumber(1234567));//true
        System.out.println(isMagicNumber(12345678));//false
        System.out.println(isMagicNumber(123456789));//false
    }
}
