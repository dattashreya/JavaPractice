public class Main {
	public static void main(String[] args) {
	   Calc obj = new Calc();
	   System.out.println("Result:"+obj.run());
	}
}
class Calc {
    public int run() {
        int x=2; int y=5;
        return x+y;
    }
} 
