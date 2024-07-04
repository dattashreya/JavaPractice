public class ArithmeticExceptionExample {
  public static void main(String[ ] args) {
    int age = 15;
    if(age < 18) {
        throw new ArithmeticException("Access denied - you must be 18yrs old");
    } else {
        System.out.println("Access granted - You are adult enough!");
    }
  }
}