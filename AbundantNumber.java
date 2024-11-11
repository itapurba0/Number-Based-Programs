public class AbundantNumber {
   
    static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum > num;
    }
    public static void main(String[] args) {
        System.out.println(isAbundantNumber(12));//True
        System.out.println(isAbundantNumber(13));//False
        System.out.println(isAbundantNumber(0));//False
        System.err.println(isAbundantNumber(24));//True
    }

}