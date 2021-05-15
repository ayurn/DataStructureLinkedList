public class MyQueue {

    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    public INode dequeue() {
        return  myLinkedList.pop();
    }
}
