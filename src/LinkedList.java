public class LinkedList <AnyType extends IDedObject>{
    private Node head;
    private int len;
    public class Node{
        private AnyType data;
        private Node next;
        public Node(){
            this.data=null;
            this.next=null;
        }
    }
    public LinkedList(){
        head=null;
        len=0;
    }
    public void makeEmpty(){
        this.head=null;
        return;

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
        return null;
    }
    public boolean insertAtFront(AnyType x){
        if (this.head.data.getID()==x.getID()){
            return false;
        }
        Node newHead=new Node(x,head);
        this.head=newHead;
        return true;
    }
    public AnyType deleteFromFront(){
        this.head.data.printID();
        this.head=head.next;
        return null;
    }
    public AnyType delete(int ID){
        Node currNode = this.head;
        while (currNode!=null){
            if (currNode.data.getID() == ID){
                currNode.data.printID();
                return null;
            }
            currNode=currNode.next;
        }
        return null;

    }
    public void printAllRecords() {
        if (this.head == null) {
            return;
        }
        Node currNode = this.head;
        while (currNode != null) {
            currNode.data.printID();
            currNode = currNode.next;
        }
        return;
    }
}
