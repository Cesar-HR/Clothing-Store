package model;

/**
 *
 * @author Cesar Hidalgo Rojas
 */
public class Cart {

    private int item;
    private int idProduct;
    private String name;
    private String description;
    private double priceOut;
    private int quantity;
    private double subTotal;

    public Cart() {
    }

    public Cart(int item, int idProduct, String name, String description, double priceOut, int quantity, double subTotal) {
        this.item = item;
        this.idProduct = idProduct;
        this.name = name;
        this.description = description;
        this.priceOut = priceOut;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(double priceOut) {
        this.priceOut = priceOut;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
