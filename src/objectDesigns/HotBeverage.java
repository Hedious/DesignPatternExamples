package objectDesigns;

public abstract class HotBeverage {
    private SellingType sellingType;

    public HotBeverage(SellingType sellingType) {
        this.sellingType = sellingType;
    }
}
