

public class ContratosFactory extends Factory{
    
    @Override
    Car retrieveCar(String requestedGrade) {
        
        if("A".equals(requestedGrade)){
            return new CorolaCar(200, "Gasoline", "Red");
    }else{
        return null;
    }
}
}
