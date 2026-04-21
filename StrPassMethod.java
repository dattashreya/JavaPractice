class Animal {
    public void run() {
        System.out.println("Animal Running....");
    }
    public void bark(String b) {
        System.out.println(b+" barking....");
    }
}
public class StrPassMethod {
	public static void main(String[] args) {
	   Animal obj = new Animal();
	   obj.run();
	   obj.bark("lalu");
	}
}
