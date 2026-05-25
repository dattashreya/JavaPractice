import java.util.*;
import java.util.stream.Stream;
public class Main
{
	public static void main(String[] args) {
	    List<Integer> nums = Arrays.asList(4,2,3,1);
	    nums.stream().map(i->i+1).forEach(n -> System.out.println(n));
	}
}
