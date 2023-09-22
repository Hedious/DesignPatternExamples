package creationalpatterns.abstractfactory;

public class VictorianCoffeeTable extends CoffeeTable{
    @Override
    public void createCoffeeTable() {
        System.out.println("Victorian CoffeeTable");
    }
}
