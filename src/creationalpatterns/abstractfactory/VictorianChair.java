package creationalpatterns.abstractfactory;

public class VictorianChair extends Chair {
    @Override
    public void createChair() {
        System.out.println("Victorian Chair");
    }
}
