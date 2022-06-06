package model;

/**
 *
 * @author Cesar Hidalgo Rojas
 */
public class Product {

    private int idProduct;
    private String name;
    private String picture;
    private String description;
    private Double price;
    private int stock;

    public Product() {
    }

    public Product(int idProduct, String name, String picture, String description, Double price, int stock) {
        this.idProduct = idProduct;
        this.name = name;
        this.picture = picture;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
