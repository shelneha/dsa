class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head; 
        } else {
            Node current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head; 
        }
    }

    public void display() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }
}

public class Circular {
    public static void main(String[] args) {
        CircularLinkedList linkedList = new CircularLinkedList();

        linkedList.insert(25);
        linkedList.insert(18);
        linkedList.insert(30);
        linkedList.insert(45);
        linkedList.insert(12);

        linkedList.display();
    }
}