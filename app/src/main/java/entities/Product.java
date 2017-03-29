package entities;

/**
 * Created by uizen on 15.03.2017.
 */

public class Product {
    private String name;
    private double price_excl;
    private double price_incl;
    private String category;
    private int count;


    private String reference;

    public Product(String name, double price_excl, double price_incl, String reference, String category) {
        this.category = category;
        this.price_excl = price_excl;
        this.price_incl = price_incl;
        this.name = name;
        this.reference = reference;
        this.count = 1;
    }

//    public Product(String name, String category) {
//        this.name = name;
//        this.category = category;
//    }

    public void increaseCount() { count++; }
    public void decreaseCount() { count--; }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrice_excl() {
        return price_excl;
    }

    public void setPrice_excl(float price_excl) {
        this.price_excl = price_excl;
    }

    public double getPrice_incl() {
        return price_incl;
    }

    public void setPrice_incl(float price_incl) {
        this.price_incl = price_incl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object obj) {
        Product p = (Product) obj;
        return p.getPrice_incl() == this.getPrice_incl()
                && p.getPrice_excl() == this.getPrice_excl()
                && p.getCategory().equals(this.getCategory())
                && p.getCount() == this.getCount()
                && p.getName().equals(this.getName());


    }
}