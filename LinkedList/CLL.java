package LinkedList;

public class CLL {

    private Node head;
    private Node tail;
    private int size;

    public int getSize(){
        return size;
    }

    public  void addRight(int value){
        Node node  = new Node(value);
        if(head == null ){
            head  = node;
            tail = head;
            return;
        }

        tail.next = node;
        tail = tail.next;

        tail.next = head;

    }

    public  void traverse(){
        Node temp = head;
        while (temp != tail){
            System.out.print(temp.value +" -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    private  class Node{
        private Node next;
        private int value;

        Node(int value){
            this.value = value;
        }
    }

}
