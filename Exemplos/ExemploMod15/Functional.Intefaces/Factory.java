

public abstract class Factory {
    
    public Car create(String requestedGrade){
        Car car = retrieveCar(requestedGrade);
        car = prepareCar(car);
        return car;
    }

    private Car prepareCar(Car car) {
        car cleanCar();
        car fuelCar();
        car checkEngine();

        return car;
    }
    private void cleanCar() {
    }

    private void fuelCar() {
    }

    abstract Car retrieveCar(String requestedGrade);
}
