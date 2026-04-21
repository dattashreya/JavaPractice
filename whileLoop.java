import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    System.out.print("Enter Number?");
	    Scanner o = new Scanner(System.in);
	    int x=o.nextInt();
	    while(x<=4){
	        System.out.println(x);
	        x++;
	    }
	}
}
