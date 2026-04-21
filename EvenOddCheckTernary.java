import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    System.out.println("Enter Number?");
	    Scanner o = new Scanner(System.in);
	    int x=o.nextInt();
	    String r = x%2==0  ? "Even" : "Odd";
	    System.out.println(x + " is "+r);
	}
}
