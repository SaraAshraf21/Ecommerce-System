package ecommercesystem1;
public class BookProduct1 extends Product1{
     private String author;
    private String publisher;
    
    public BookProduct1(String author, String publisher, int productId, String name, float price) {
        super(productId, name, price);
        this.author = author;
        this.publisher = publisher;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }}  

