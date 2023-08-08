public class CheeseBurgerBuilder extends BurgerBuilder{

    @Override
    public void buildBun(){
        burger.setBun("White bread");
    }

    @Override
    public void buildMeat(){
        burger.setMeat("Beef");
    }

    @Override
    public void buildSalad(){
        burger.setSalad("Iceberg lettuce");
    }

    @Override
    public void buildSauce(){
        burger.setSauce("Ketchup");
    }

    @Override
    public void buildCheese(){
        burger.setCheese("Cheddar");
    }
    
}
