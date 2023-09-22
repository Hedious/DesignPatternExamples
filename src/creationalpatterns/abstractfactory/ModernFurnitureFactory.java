package creationalpatterns.abstractfactory;

public class ModernFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair CreateChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable CreateCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
