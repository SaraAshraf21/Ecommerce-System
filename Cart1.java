package ecommercesystem1;
import javax.swing.JOptionPane;
public class Cart1 {
     private int customerId;
     int nProducts;
    private Product1[] products;
    
    public int getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
           }
    
    public int getnProducts() {
        return nProducts;
    }
    
     public void setnProducts(int nProducts) {
        this.nProducts=Math.abs(nProducts);
        products=new Product1[nProducts];
    }
     
    public Product1[] getProducts() {
        return products;
    }

    public void setProducts(Product1[] products) {
        this.products = new Product1[nProducts];
    }
public  void addProduct(Product1 p){
        for (int i = 0; i <nProducts; i++) {
      if(products[i]==null){
         products[i]=p;
         return;
      }}
        JOptionPane.showMessageDialog(null,"the cart is full,can not add more products." );
      }
  
public void removeProduct(int tran){
         if (tran >=0&& tran< nProducts) {//(index >=0 && index< nProduct
            products[tran] = null;
        }
         else{
            JOptionPane.showMessageDialog(null," cannot remove product." );
         }    
    }

public float calculatePrice(){
       float total=0;
       for (int i = 0; i <products.length; i++) {//products.length=nProducts
           if(products[i]!=null){
           total +=products[i].getPrice();
       } }
       return total;
   }

   public void placeOrder(int o){
       switch(o){
           case 1:
             JOptionPane.showMessageDialog(null,"Now, your Order is been Confirmed." );

               //order.PrintInfo();
               break;
           case 2:
               for(int i=0;i<products.length;i++){
                products[i] = null;   
               }
           break;
       } 
 }//methode place order
   
}

    

