package ecommercesystem1;
import javax.swing.JOptionPane;
public class ECommerceSystem1 {
    public static void main(String[] args) {   
    String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name+" to ECommerce System!");
        
    String Address=JOptionPane.showInputDialog("Please "+name+" Enter your address");
    
    int ID=Integer.parseInt(JOptionPane.showInputDialog("Please "+name+" Enter your ID"));
    
    Customer1 C=new Customer1(ID,name,Address);
    
    ElectronicProduct1 E=new ElectronicProduct1("Samsung",1,1,"SmartPhone",599.9f);
    ClothingProduct1 C2=new ClothingProduct1("Medium","Coton",2,"T-shirt",19.99f);  
    BookProduct1 B=new BookProduct1("O’Reilly","X Publications",3,"OOP",93.99f);
    
    int NProducts=Integer.parseInt(JOptionPane.showInputDialog("How many Products you want to add?"));
    Cart1 A=new Cart1();
        A.setnProducts(NProducts);
        A.setCustomerId(ID);  
        
    for (int i = 0; i < NProducts ; i++) {
        int ARRAY=Integer.parseInt(JOptionPane.showInputDialog("Which product would you like to add?1-Smart Phone  2-T-Shirt  3-OOP"));
        switch(ARRAY){
            case 1:
              A.addProduct(E);
               break;
            case 2:
               A.addProduct(C2);
                break;
            case 3:
               A.addProduct(B);
                break;
            default:
                System.out.println("invalid choice!");
        }//switch 
        }//for 
    
            JOptionPane.showMessageDialog(null,"Your total's  "+A.calculatePrice()+"$");
            
    int CHOICE=Integer.parseInt(JOptionPane.showInputDialog("Would you like to place the order? 1-Yes  2-No"));
    A.placeOrder(CHOICE);
    if(CHOICE==1){
        Order1 O=new Order1(A);
        O.printOrderInfo();
        JOptionPane.showMessageDialog(null,"Thank you "+name+" to use our Ecommerece System!"
);
    }
    else if(CHOICE==2){
      JOptionPane.showMessageDialog(null,"Your Cart is Empty Now.\nThank you "+name+" to use our Ecommerece System!");  
    }
    else{
      JOptionPane.showMessageDialog(null,"invalid input");  
    }
    }} 

