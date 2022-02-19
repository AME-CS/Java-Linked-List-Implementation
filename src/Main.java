import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        Scanner in=new Scanner(System.in);
        int choice = 1;
        while (true){
            System.out.println("Operations on List\n\t1. Make Empty\n\t2. Find ID\n\t3. Insert At Front\n\t4. Delete From Front\n\t5. Delete ID\n\t6. Print All Records\n\t7. Done");
            choice=in.nextInt();
            System.out.println("Your Choice: "+choice);
            switch (choice){
                case 1: list.makeEmpty();
                case 2:
                    System.out.println("Enter Product ID: ");
                    int searchID=in.nextInt();
                    list.findID(searchID);
                case 3:
                    System.out.println("Enter Product ID: ");
                    int ID=in.nextInt();
                    System.out.println("Enter Product Name: ");
                    String prodName=in.next();
                    System.out.println("Enter Supplier Name: ");
                    String suppName=in.next();
                    Product newProd= new Product(ID,prodName,suppName);
                    list.insertAtFront(newProd);
                case 4: list.deleteFromFront();
                case 5:
                    System.out.println("Enter Product ID: ");
                    int deleteID=in.nextInt();
                    list.delete(deleteID);
                case 6: list.printAllRecords();
                default:
                    System.out.println("Invalid Choice: Program is Terminated");
                    break;

            }


        }



    }
}
