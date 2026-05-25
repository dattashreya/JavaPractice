import java.util.*;
import java.util.stream.Stream;
public class Main
{
	public static void main(String[] args) {
	    List<Integer> nums = Arrays.asList(4,2,3,1);
	    int r = 
	        nums.stream()
	        .map(i->i+1)
	        .reduce(0, (c,e) -> c+e);
	    System.out.println(r);
	}
}
