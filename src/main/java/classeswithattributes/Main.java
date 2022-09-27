package classeswithattributes;

public class Main {
    public static void main(String[] args) {

        //Product product = new Product(1991,"Masaüstü Bilgisayar","ASUS",6500,7,"Siyah");

        Product product = new Product();
        product.setName("Dizüstü Bilgisayar");
        product.setId(1987);
        product.setCode("cw123");
        product.setDescription("Lenovo");
        product.setPrice(7000);
        product.setStockAmount(4);
        product.setColor("Gri");

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        System.out.println(product.getId() + " " + product.getName() + " " + product.getDescription() + " " + product.getCode() + " " + product.getColor());

    }
}