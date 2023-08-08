public class VeganBurgerBuidler extends BurgerBuilder {

    @Override
    public void buildBun(){
        burger.setBun("Whole grain bread");
    }

    @Override
    public void buildMeat(){
        burger.setMeat("Vegan meat");
    }

    @Override
    public void buildSalad(){
        burger.setSalad("Iceberg lettuce");
    }

    @Override
    public void buildSauce(){
        burger.setSauce("Vegan sauce");
    }

    @Override
    public void buildCheese(){
        burger.setCheese("Vegan cheese");
    }


    
}
