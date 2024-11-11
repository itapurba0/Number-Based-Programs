public class DuckNumber {
   

      static boolean isDuckNumber(int num) {
        String numStr = Integer.toString(num);
        if (numStr.charAt(0) == '0') {
            return false;
        }
        return numStr.contains("0");
    }
    public static void main(String[] args) {
        System.out.println(isDuckNumber(1203));//false
        System.out.println(isDuckNumber(202));//true
        System.out.println(isDuckNumber(0112));//false
        System.out.println(isDuckNumber(0));//false

    }
}
