public class Burger {

    private String bun = "No Bun";
    private String meat = "No Meat";
    private String salad = "No Salad";
    private String sauce = "No Sauce";
    private String cheese = "No Cheese";

    public void setBun(String bun){
        this.bun = bun;
    }

    public void setMeat(String meat){
        this.meat = meat;
    }

    public void setSalad(String salad){
        this.salad = salad;
    }

    public void setSauce(String sauce){
        this.sauce = sauce;
    }

    public void setCheese(String cheese){
        this.cheese = cheese;
    }

    public void print(){
        System.out.println("Bun: " + bun);
        System.out.println("Meat: " + meat);
        System.out.println("Salad: " + salad);
        System.out.println("Sauce: " + sauce);
        System.out.println("Cheese: " + cheese);
    }
    
}
