package ecommercesystem1;
public class ClothingProduct1 extends Product1{
     private String size;
    private String fabric;
    
    public ClothingProduct1(String size, String fabric, int productId, String name, float price) {
        super(productId, name, price);
        this.size = size;
        this.fabric = fabric;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public String getFabric() {
        return fabric;
    }
    
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }}


    

