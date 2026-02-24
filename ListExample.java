import java.util.*;
public class ListExample
{
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("guava");
		System.out.println("array list: "+fruits);
		System.out.println("array list 0: "+fruits.get(0));
		System.out.println("array list 1: "+fruits.get(1));
		fruits.remove(1);
		System.out.println("array list: "+fruits);
		System.out.println("array list 1: "+fruits.get(1));
	}
}
