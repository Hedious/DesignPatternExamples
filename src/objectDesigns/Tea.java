package objectDesigns;

public abstract class Tea extends HotBeverage {
    private double dairyCreamerAmount;
    private int akyaYayAmount;
    private double sugarAmount;

    public Tea(SellingType sellingType, double dairyCreamerAmount, int akyaYayAmount, double sugarAmount) {
        super(sellingType);
        this.dairyCreamerAmount = dairyCreamerAmount;
        this.akyaYayAmount = akyaYayAmount;
        this.sugarAmount = sugarAmount;
    }
}
