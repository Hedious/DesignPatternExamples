package objectDesigns;

public class CoffeeHnutPhyaw extends Coffee {
    private double dairyCreamAmount;
    private double coffeePowderAmount;
    private double sugarAmount;

    public CoffeeHnutPhyaw(SellingType sellingType) {
        super(sellingType);
        this.dairyCreamAmount = 2;
        this.coffeePowderAmount = 3;
        this.sugarAmount = 3;
    }
}
