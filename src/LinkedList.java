public class LinkedList <AnyType extends IDedObject>{
    private Node head;
    public class Node{
        private AnyType data;
        private Node next;
        public Node(AnyType data, Node next){
            this.data=data;
            this.next=next;
        }
    }
    public LinkedList(){
        this.head=null;
    }
    public void makeEmpty(){
        this.head=null;
    }
    public AnyType findID(int ID){
        Node currNode = this.head;
        while (currNode!=null){
            if (currNode.data.getID() == ID){
                currNode.data.printID();
                return null;
            }
            currNode=currNode.next;
        }
        System.out.println("\t\tID: "+ID+" is not present in this list.");
        return null;
    }
    public boolean insertAtFront(AnyType x){
        if (this.head!=null && this.head.data.getID()==x.getID()){
            return false;
        }
        this.head= new Node(x,head);
        return true;
    }
    public AnyType deleteFromFront(){
        if (this.head==null){
            System.out.println("\t\tList is empty.");
            return null;
        }
        System.out.println("\t\tDeleted Product Details:");
        this.head.data.printID();
        System.out.println("\t\tFirst Item Deleted.");
        this.head=head.next;
        return null;
    }
    public AnyType delete(int ID){
        Node currNode = this.head;
        Node prevNode=null;
        int i=0;
        while (currNode!=null){
            if (currNode.data.getID() == ID){
                if (i==0){
                    deleteFromFront();
                    return null;
                }
                System.out.println("\t\tDeleted Product Details:");
                currNode.data.printID();
                prevNode.next=currNode.next;
                return null;
            }
            prevNode=currNode;
            currNode=currNode.next;
            i++;
        }
        System.out.println("\t\tID: "+ID+" is not present in this list.");
        return null;

    }
    public void printAllRecords() {
        if (this.head == null) {
            System.out.println("\t\tNo Records Found");
            return;
        }
        Node currNode = this.head;
        int i=1;
        while (currNode != null) {
            System.out.println("\n\t\tProduct "+i+" Details:");
            currNode.data.printID();
            currNode = currNode.next;
            i++;
        }
    }
}
