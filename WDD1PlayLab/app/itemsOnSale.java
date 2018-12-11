package models;

public class ItemOnSale extends Model {

    // Properties
    private Long id;
    private String name;
    private String description;
    private int stock;
    private double price;

    // Default Constructor
    public ItemOnSale() {
    }

    // Constructor to initialise object
    public ItemOnSale(Long id, String name, String description, int stock, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    // Accessor methods
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getdescription() {
       return name;
    }
    public void setdescription(String name) {
        this.name = name;
    }
    public void setstock(String name) {
        this.name = name;
    }
    public void getstock() {
        return name;
    }
    public void setprice(String name) {
        this.name = name;
    }
    public void getprice(String name) {
        return name;
    }
    
