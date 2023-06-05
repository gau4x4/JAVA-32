public class Product {
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return this.price;
    }
    public double getPrice(int quantity){
        return this.price*quantity;
    }

    public static void main(String []args){
        Product product = new Product();
        product.setPrice(100.0);
        System.out.println(product.getPrice(20));
    }
}