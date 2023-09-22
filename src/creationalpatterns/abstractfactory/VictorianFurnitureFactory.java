package creationalpatterns.abstractfactory;

public class VictorianFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair CreateChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable CreateCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
