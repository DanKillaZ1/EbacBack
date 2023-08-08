package Singleton;

public class DamoSingletonPropriedade {

    public static void main(String[] args) {
        SingletonPropriedade singleton = SingletonPropriedade.getInstance("Hello");
        SingletonPropriedade singleton2 = SingletonPropriedade.getInstance("World");
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());


    }
    
}
