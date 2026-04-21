import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    System.out.println("Enter Number?");
	    Scanner o = new Scanner(System.in);
	    int x=o.nextInt();
	    switch(x) {
	        case 1:
	            System.out.println(x + " is Monday"); break;
	        case 2:
	            System.out.println(x + " is Tuesday"); break;
	        case 3:
	            System.out.println(x + " is Wednesday"); break;
	        case 4:
	            System.out.println(x + " is Thursday"); break;
	        case 5:
	            System.out.println(x + " is Friday"); break;
	        case 6:
	            System.out.println(x + " is Saturday"); break;
	        case 7:
	            System.out.println(x + " is Sunday"); break;   
	        default:
	            System.out.println(x + " is none"); 
	    }
	}
}
