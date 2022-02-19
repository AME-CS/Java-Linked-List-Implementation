public class Product implements IDedObject{
    private int productID;
    private String productName;
    private String supplierName;
    public Product(int ID,String prodName,String suppName){
        this.productID=ID;
        this.productName=prodName;
        this.supplierName=suppName;
    }

    public int getID(){
        return this.productID;
    }

    public void printID() {
        System.out.println("\t\tProduct ID: "+this.productID);
        System.out.println("\t\tProduct Name: "+this.productName);
        System.out.println("\t\tSupplier Name: "+this.supplierName);
    }
}
