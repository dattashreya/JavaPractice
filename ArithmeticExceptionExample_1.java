public class ArithmeticExceptionExample_1 {  
    public static void main(String[] args) { 
        try {
            int a=10;
            int y=a/0;
            System.out.println(y);
        } catch(ArithmeticException e) {
            System.out.println("Should avoid dividing by 0 " + e); 
        } finally {
            System.out.println("done");
        }
    }
}  