public class DisariumNumber {
   

    public static boolean isDisariumNumber(int num) {
        int sum = 0;
        int n = num;
        int length = Integer.toString(num).length();

        while (n > 0 ) {
            int digit = n % 10;
            sum += Math.pow(digit, length);
            n /= 10;
            length--;
        }

        return (sum == num && num != 0);
    }
    public static void main(String[] args) {
       System.err.println(isDisariumNumber(135));
       System.err.println(isDisariumNumber(89));
       System.out.println(isDisariumNumber(0));
    }
}
