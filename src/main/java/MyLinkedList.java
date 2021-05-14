public class MyLinkedList implements INode{
    public INode head;
    public INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newNode) {
        if (this.tail == null)
            this.tail = newNode;
        if (this.head == null)
            this.head = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //UC3 APPEND DATA
    public void append(INode newNode) {
        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else {
            INode tempNode = this.tail;
            this.tail = newNode;
            tempNode.setNext(newNode);
        }
    }

    //UC4 INSERT DATA IN BETWEEN
    public void insert(INode myNode, INode newNode) {
        this.head.setNext(myNode);
        myNode.setNext(newNode);
    }

    //UC5 DELETE THE FIRST ELEMENT
    public INode pop() {
        INode  tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    //UC6 DELETE THE LAST ELEMENT
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = null;
        return tempNode;
    }

    public void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

    @Override
    public Object getKey() {
        return null;
    }

    @Override
    public void setKey(Object key) {

    }

    @Override
    public INode getNext() {
        return null;
    }

    @Override
    public void setNext(INode next) {

    }
}