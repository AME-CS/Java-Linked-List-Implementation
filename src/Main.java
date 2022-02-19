import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        LinkedList list= new LinkedList();
        Scanner scanner=new Scanner(System.in);
        int choice = 1;
        boolean cont = true;
        while (cont){
            System.out.println("\nOperations on List\n\t1. Make Empty\n\t2. Find ID\n\t3. Insert At Front\n\t4. Delete From Front\n\t5. Delete ID\n\t6. Print All Records\n\t7. Done");
            System.out.print("\n\t\tYour Choice: ");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    list.makeEmpty();
                    System.out.println("\t\tList is empty.");
                    break;
                case 2:
                    System.out.print("\t\tID No: ");
                    int searchID=scanner.nextInt();
                    list.findID(searchID);
                    break;
                case 3:
                    System.out.print("\t\tEnter Product ID: ");
                    int ID=scanner.nextInt();
                    System.out.print("\t\tEnter Product Name: ");
                    String prodName=scanner.next();
                    prodName+=scanner.nextLine();
                    System.out.print("\t\tEnter Supplier Name: ");
                    String suppName=scanner.next();
                    suppName+= scanner.nextLine();
                    Product newProd= new Product(ID,prodName,suppName);
                    if (list.insertAtFront(newProd)){
                        System.out.println("\t\t...\n\t\tProduct Added");
                    }
                    break;
                case 4:
                    list.deleteFromFront();
                    break;
                case 5:
                    System.out.print("\t\tEnter Product ID: ");
                    int deleteID=scanner.nextInt();
                    list.delete(deleteID);
                    break;
                case 6:
                    list.printAllRecords();
                    break;
                default:
                    if (choice==7){System.out.println("\t\tDone.");} else{System.out.println("\t\tInvalid Choice: Program Terminated.");}
                    cont=false;
                    break;
            }
        }
    }
}
