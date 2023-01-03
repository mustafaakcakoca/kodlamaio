package kodlamahmwrk;

public class Product1 {
    public static void main(String[] args) {
        Product product=new Product();
        product.setId(1);
        product.set_name("Laptop");
        product.set_description("Asus Laptop");
        product.set_price(5000);
        product.set_stockAmount(3);
        System.out.println(product.get_name("Laptop"));
        System.out.println(product.get_kod());

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
    }
}
