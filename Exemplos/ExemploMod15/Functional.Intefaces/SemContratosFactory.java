 

public class SemContratosFactory extends Factory {

    @Override
    Car retrieveCar(String requestedGrade) {

        if("A".equals(requestedGrade)){
            return new Duster(200, "Gasoline", "Branco");
    }else{
        return null;
    }        
       
}
    
}
