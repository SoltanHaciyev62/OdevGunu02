package hw4;

public class Run {
    public static void main(String[] args) {

        Product product = new Product();
        product.id = 75568496;
        product.setName("LAPTOP");
        product.setDescription("Lenovo");
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());
    }
}
