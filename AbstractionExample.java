abstract class Animal {
  public abstract void animalSound();

  public void sleep() {
    System.out.println("Zzz");
  }
}


class Pig extends Animal {
  public void animalSound() {

    System.out.println("The pig says: wee wee");
  }
}

class AbstractionExample {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}
