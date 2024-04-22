package ecommercesystem1;
import javax.swing.JOptionPane;
public class Order1 {
    private int customerId, orderId;
    private Product1[] products;
    private float totalPrice;
    private int nProducts;
    
    public Order1(Cart1 A) {
        this.customerId =A.getCustomerId();
        this.orderId =(int) (Math.random() * 100);
        this.products=A.getProducts();
        this.totalPrice =A.calculatePrice();
    }
    
 public  void printOrderInfo() {
  JOptionPane.showMessageDialog(null,"Here's your order's summary:"+"\nOrder ID:"+ orderId+ " \nCustomer ID: "+ customerId+" \nTotal Price: " + totalPrice+"$"+"\nOrdered Products:");
      for (int i=0;i<products.length;i++) {
            if ( products[i]!= null) {
                JOptionPane.showMessageDialog(null,"name :"+products[i].getName()+", price: "+products[i].getPrice()+"$" ); 
            }
        }
                JOptionPane.showMessageDialog(null,"total price: "+totalPrice+"$"); 
 } 
}
