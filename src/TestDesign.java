import creationalpatterns.abstractfactory.*;
import creationalpatterns.factory.Circle;
import creationalpatterns.factory.Shape;
import creationalpatterns.factory.ShapeFactory;
import creationalpatterns.factory.Square;
import creationalpatterns.factorymethod.BeefBurgerRestaurant;
import creationalpatterns.factorymethod.Restaurant;
import creationalpatterns.singleton.LoggerSingleton;

public class TestDesign {
    public static void main(String[] args) {

        Shape circle = ShapeFactory.createShape("Circle");
        circle.draw();
        System.out.println("----------------------------------");

        Restaurant restaurant = new BeefBurgerRestaurant();
        restaurant.orderBurger();
        System.out.println("----------------------------------");

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.CreateChair();
        modernChair.createChair();


        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        CoffeeTable victorianCoffeeTable = victorianFactory.CreateCoffeeTable();
        victorianCoffeeTable.createCoffeeTable();

        LoggerSingleton loggerSingleton = LoggerSingleton.getLoggerInstance();
        LoggerSingleton loggerSingleton1 = LoggerSingleton.getLoggerInstance();


        System.out.println(loggerSingleton.hashCode());
        System.out.println(loggerSingleton1.hashCode());
        loggerSingleton.writeLog("Log");
    }
}
