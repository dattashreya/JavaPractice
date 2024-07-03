class Vehicle {
  protected String brand = "Ford";      
  public void honk() {                   
    System.out.println("hello car!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";  
  public static void main(String[] args) {

    Car myCar = new Car();

    myCar.honk();
    System.out.println("Brand: "+myCar.brand + " \nmodelName: " + myCar.modelName);
  }
}