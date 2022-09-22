package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
       
        product product2 = new product(58,"Laptop","Casper laptop",3000,5,"Siyah");
    
       
        product product = new product();
        product.setName("Laptop");
        product.setId(16);
        product.setDescription("Asus laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        product.setRenk("Siyah");
        System.out.println(product.getCode());

        productManager productManager = new productManager();
        productManager.add(product2);
        System.out.println(product2.getCode());

    }
}
