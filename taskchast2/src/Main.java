public class Main {
    public static void main(String[] args) {
       List list = new List();
       list.addEnd(1);
        list.addEnd(2);
        list.addEnd(3);
        list.addEnd(4);
        list.addEnd(5);
        list.addEnd(6);
        list.addEnd(7);

        list.peekQueue();

        list.pollQueue();

        list.printQueue();

        System.out.println();

        list.peekStack();

        list.popStack();

        list.printStack();



    }
}