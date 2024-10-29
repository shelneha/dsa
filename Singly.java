class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


public class Singly {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();

        linkedList.insert(25);
        linkedList.insert(18);
        linkedList.insert(30);
        linkedList.insert(45);
        linkedList.insert(12);

        linkedList.display();
		
	

	}

}
