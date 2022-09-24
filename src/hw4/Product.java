package hw4;

public class Product {
    int id;
    private String name;
    private String description;
    private int stockAmount;
    private String kod;


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

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    public String getKod(){
        return this.name.substring(0,1) + id;
    }
}
