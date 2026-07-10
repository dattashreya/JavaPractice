import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Main
{
	public static void main(String[] args) {
        String ip = "deloitte";
        Map<Character, Long> ct = ip.chars()
        .mapToObj( c -> (char) c)
        .collect(Collectors.groupingBy(
            Function.identity(),
            Collectors.counting()
            ));
        
        System.out.println(ct);
	}
}
