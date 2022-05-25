class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedLIst {
    public static void main(String[] args) {
        Node node_1 = new Node(12);
        Node node_2 = new Node(10);
        Node node_3 = new Node(11);
        Node node_4 = new Node(7);      
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        
        Node current = node_1;
        while(current != null) {
            System.out.println(current.data + "," + current.next);
            current = current.next;
        }

    }
    
}
