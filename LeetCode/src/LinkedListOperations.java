class NodeLL<T> {
    T data;
    NodeLL<T> next;
    public NodeLL(T data) {
        this.data = data;
        this.next = null;
    }
}

class Operations<T> {
    private NodeLL<T> start;
    void insertAtBeg(NodeLL<T> node) {
        if(start == null) {
            start = node;
            return;
        }

        node.next = start;
        start = node;
    }

    void insertAtEnd(NodeLL<T> node) {
        if(start == null) {
            start = node;
            return;
        }

        NodeLL<T> current = start;
        while(current.next != null) {
            current = current.next;
        }

        current.next = node;

    }

    void insertAtMid(NodeLL<T> node, int pos) {
        if(start == null) {
            start = node;
            return;
        }

        if(pos == 0) {
            insertAtBeg(node);
        }

        if(pos > 1) {
            int i = 1;
            NodeLL<T> temp = start;
            while(i < pos) {
                temp = temp.next;
                i++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    void findKthFromLast(int k) {
        NodeLL<T> p;
        NodeLL<T> q;
        p = q = start;
        for(int i = 0; i < k; i++) {
            q = q.next;
        }
        while(q != null) {
            q = q.next;
            p = p.next;
        }
        System.out.println(p.data);
    }

    void printLinkedList() {
        NodeLL<T> current = start;
        while(current != null) {
            System.out.println(current.data + "," + current.next);
            current = current.next;
        }
    }
}

public class LinkedListOperations {
    public static void main(String[] args) {
        NodeLL<Integer> node_1 = new NodeLL<>(12);
        NodeLL<Integer> node_2 = new NodeLL<>(15);
        NodeLL<Integer> node_3 = new NodeLL<>(18);
        NodeLL<Integer> node_4 = new NodeLL<>(11);

        Operations<Integer> obj = new Operations<>();
        obj.insertAtBeg(node_1);
        obj.insertAtBeg(node_2);
        obj.insertAtBeg(node_3);
        obj.insertAtBeg(node_4);

        NodeLL<Integer> node_5 = new NodeLL<>(110);
        obj.insertAtEnd(node_5);

        NodeLL<Integer> node_6 = new NodeLL<>(19);
        obj.insertAtMid(node_6, 3);

        obj.printLinkedList();
        
    }
}

