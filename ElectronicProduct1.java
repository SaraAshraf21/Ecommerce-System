package ecommercesystem1;
public class ElectronicProduct1 extends Product1 {
    private String brand;
    private int warrantyPeriod;
    
    public ElectronicProduct1(String brand, int warrantyPeriod, int productId, String name, float price) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    
    public void setWarrantyPeriod(int warrantyPeriod) {
       this.warrantyPeriod =Math.abs(warrantyPeriod);
    }
 
}
