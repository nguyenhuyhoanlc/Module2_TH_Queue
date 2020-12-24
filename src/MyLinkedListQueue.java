public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public Node add(){
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.tail = null;
        if (this.head == null)
            this.tail = null;
        return temp;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null){
            this.head = this.tail = temp;
            return;
        }
            this.tail.next = temp;
        this.tail = temp;
    }
}
