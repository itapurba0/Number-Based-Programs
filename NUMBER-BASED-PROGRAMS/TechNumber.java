public class TechNumber {
    
    public static boolean isTechNumber(int num) {
        String strNum = Integer.toString(num);
        int length = strNum.length();
        if (length % 2 != 0) {
            return false;
        }

        int firstPart = Integer.parseInt(strNum.substring(0, length / 2));
        int secondPart = Integer.parseInt(strNum.substring(length / 2));
        int sum = firstPart + secondPart;
        return (sum * sum) == num;
    }
    public static void main(String[] args) {
        System.out.println(isTechNumber(2025)); // true
        System.out.println(isTechNumber(3025)); // true
        System.out.println(isTechNumber(2024)); // false
        System.err.println(isTechNumber(0));//false
    }
}
