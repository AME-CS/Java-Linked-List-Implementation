public class Product implements IDedObject{
    private int productID;
    private String productName;
    private String supplierName;
    public Product(int ID,String prodName,String suppName){
        productID=ID;
        productName=prodName;
        supplierName=suppName;
    }

    public int getID(){
        return this.productID;
    }

    public void printID() {
        System.out.println("Product ID: "+this.productID);
        System.out.println("Product Name: "+this.productName);
        System.out.println("Supplier Name: "+this.supplierName);
        return;
    }
}