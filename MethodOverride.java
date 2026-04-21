class Animal {
    public void run() {
        System.out.println("Animal Running....");
    }
}
class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("Dog Running....");
    }
}
public class MethodOverride {
	public static void main(String[] args) {
	   Animal obj = new Animal();
	   Dog d = new Dog();
	   obj.run();
	   d.run();
	}
}
