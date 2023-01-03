package kodlamahmwrk;

public class Product1 {
    public static void main(String[] args) {
        Product product=new Product();
        product.id=1;
        product.name="Laptop";
        product.description="Asus Laptop";
        product.price=5000;
        product.stockAmount=3;
        System.out.println(product.name);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
    }
}
