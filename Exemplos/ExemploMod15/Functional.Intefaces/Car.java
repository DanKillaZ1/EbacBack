

public abstract class Car {

    private int horsePower;
    private String fuelSource;
    private String color;

    public Car(int horsePower, String fuelSource, String color) {
        this.horsePower = horsePower;
        this.fuelSource = fuelSource;
        this.color = color;
    }

    public void startEngine(){
        System.out.println("The " + fuelSource + " engine is on " + horsePower + " horse power!");
    }

    public void cleanCar(){
        System.out.println("The " + color + " car is clean! " + color.toLowerCase(null) + " is a beautiful color!");
    }

    public void fuelCar(){
        System.out.println("The " + fuelSource + " car is fueled!");
    }

    public void checkEngine(){
        System.out.println("The " + fuelSource + " engine is checked!");
    }
    
}
