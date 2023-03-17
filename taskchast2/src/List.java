public class List {
    private Node head;
    private Node tail;

    public List() {
        head = null;
        tail = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addEnd(int data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            head = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
        }
        tail = temp;

    }
    //очередь

    public void peekQueue(){
        System.out.println(head.data);
    }

    public void pollQueue(){

        if(head.next == null){
            tail = null;
        }
        else {
            head.next.prev = null;
            head = head.next;
        }
            }




    public void printQueue(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data);
            System.out.print( " -> ");
            temp = temp.next;
        }
    }


    //стек

    public void popStack(){
        if(head.next == null){
            tail = null;
        }
        else {
            tail.prev.next = null;
            tail = tail.prev;
        }
    }


    public void peekStack(){
        System.out.println(tail.data);
    }

    public void printStack(){
        Node temp = tail;

        while (temp != null){
            System.out.print(temp.data);
            System.out.print( " -> ");
            temp = temp.prev;
        }
    }




}
