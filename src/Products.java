public class Products {
    private int id;
    private String name;
    private double price;
    private String type;
    private String unitMoney = "USD";



    public Products(int id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnitMoney() {
        return unitMoney;
    }

    public void setUnitMoney(String unitMoney) {
        this.unitMoney = unitMoney;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", type='" + getType() + '\'' +
                ", unitMoney='" + unitMoney + '\'' +
                '}';
    }
}
