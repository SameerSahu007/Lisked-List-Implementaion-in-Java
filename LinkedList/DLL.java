package LinkedList;

public class DLL {


    private Node head;
    private Node tail;
    private int size;

    public int getSize(){
        return  size;
    }

    public void addRight(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = head;
            return;
        }

        node.prev = tail;
        tail.next = node;
        tail = tail.next;
        size++;

    }

    public void traverse(){
        Node temp  = head;
        while(temp  != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverseTraverse(){
        Node temp  = tail;
        while(temp  != null){
            System.out.print(temp.value+ " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }


    public Node getNode(int index){
        int i = 1;
        Node temp = head;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        return temp;
    }


    public void addNode(int index, int value){
        if(index == size){
            addRight(value);
        }
        Node node = getNode(index);
        Node nextNode=  getNode(index + 1 );
        Node newNode = new Node(value);

        newNode.next = node.next;
        node.next = newNode;
        newNode.prev = node;
        newNode.next = nextNode;


    }



    private  class Node{
        private Node next;
        private int value;
        private Node prev;

        Node(int value){
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

}
