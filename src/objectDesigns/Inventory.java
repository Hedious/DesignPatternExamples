package objectDesigns;

public abstract class Inventory {
    private int purchasingQuantity;
    private double inStockQuantity;
    private String purchasingUnit;
    private String inStockUnit;
    private int purchasingSellingConversion;

    public Inventory(int purchasingQuantity, double inStockQuantity, String purchasingUnit, String inStockUnit, int purchasingSellingConversion) {
        this.purchasingQuantity = purchasingQuantity;
        this.inStockQuantity = inStockQuantity;
        this.purchasingUnit = purchasingUnit;
        this.inStockUnit = inStockUnit;
        this.purchasingSellingConversion = purchasingSellingConversion;
    }
}
