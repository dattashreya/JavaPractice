import java.util.*;
import java.util.stream.Stream;
public class Main
{
	public static void main(String[] args) {
	    List<Integer> nums = Arrays.asList(4,2,3,1);
	    Stream<Integer> d =  nums.stream();
	   // nums.forEach(i -> System.out.println(i));
	   d.forEach(i -> System.out.println(i));
	}
}
