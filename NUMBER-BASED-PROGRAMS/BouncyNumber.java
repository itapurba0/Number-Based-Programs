public class BouncyNumber {    static boolean isBouncyNumber(int num) {
        boolean increasing = false, decreasing = false;
        int lastDigit = num % 10;
        num /= 10;
        while (num > 0) {
            int digit = num % 10;
            if (digit < lastDigit)
                increasing = true;
            if (digit > lastDigit)
                decreasing = true;
            if (increasing && decreasing)
                return true;
            lastDigit = digit;
            num /= 10;
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(isBouncyNumber(132)); //true
        System.out.println(isBouncyNumber(252)); // true
        System.out.println(isBouncyNumber(123)); // false
    }


}