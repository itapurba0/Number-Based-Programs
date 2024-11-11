public class BuzzNumber {
   

    public static boolean isBuzzNumber(int number) {
        return (number!=0) && ((number % 7 == 0) || (number % 10 == 7));
    }
    public static void main(String[] args) {
      System.out.println(isBuzzNumber(77)); // true
      System.out.println(isBuzzNumber(7)); // true
      System.out.println(isBuzzNumber(8)); // false
      System.out.println(isBuzzNumber(0));//false
    }
}
