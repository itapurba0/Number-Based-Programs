public class NeonNumber {
   
    static boolean isNeonNumber(int num) {
        int square = num * num, sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }
    public static void main(String[] args) {
        System.out.println(isNeonNumber(9));//true
        System.out.println(isNeonNumber(25));//false
        System.err.println(isNeonNumber(1));//true
    }
}