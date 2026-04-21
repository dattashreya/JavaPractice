import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    System.out.print("Enter x? ");
	    Scanner o = new Scanner(System.in);
		  int x=o.nextInt();
		  if(x%2==0)
		    System.out.println(x + " is even");
		  else 
		    System.out.println(x + " is odd");
	}
}
