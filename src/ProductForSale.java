public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
    public  double getSalePrice(int qty){
        return price* qty;
    }
    public void printPricedItems(int qty){
        System.out.printf ("%2d qty at $%8.2f each, %-15s %-35s %n",qty,price,type,description);
    }
    public abstract void showDetail();
}
