package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    LinkedList(){
        this.size = 0;
    }

    public void addLeft(int value){
       Node obj =  new Node(value);
       obj.next = head;
       head = obj;

       if(tail == null){
           tail = head;
       }

       size++;

    }

    public void addRight(int value){
        Node node =  new Node(value);
        if(head == null){
            addLeft(value);
        }
       tail.next = node;
        tail = node;
        size++;

    }

    public void traverse() {
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node getNode(int index){
        Node temp = head;
        int i = 1;
        while(i < index){
            temp = temp.next;
            i++;
        }
          return  temp;

    }

    public void addNode(int value, int index){
        if(index == 1){
            addLeft(value);
        }
        if(index == size){
            addRight(value);
        }
        else{
            Node node  = getNode(index);
            Node newNode = new Node(value);
//            System.out.println(node.value);
            newNode.next = node.next;
            node.next = newNode;

        }

    }

    public void deleteNode(int index){
        if(index == 1){
            head = head.next;
        }
        if(index == size){
            Node node  = getNode(index - 1);
            node.next.next = null;
        }
        else{
            Node node  = getNode(index - 1);
            node.next = node.next.next;
        }
    }

    public int getSize(){
        return size;
    }

    private  class Node{
        private Node next;
        private int value;

        Node(int value){
            this.value = value;
        }
    }


}
