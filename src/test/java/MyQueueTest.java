import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    void Adding3ElementsInQueue() {
        MyNode<Integer> myFirstNode = new MyNode<Integer>(56);
        MyNode<Integer> mySecondNode = new MyNode<Integer>(30);
        MyNode<Integer> myThirdNode = new MyNode<Integer>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
    }
}
