public class PronicNumber {
    static boolean isPronicNumber(int num) {
        for (int i = 0; i * (i + 1) <= num; i++) {
            if (i * (i + 1) == num)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPronicNumber(12)); // true
        System.out.println(isPronicNumber(13)); // false
        System.out.println(isPronicNumber(20)); // true
    }
}
