package DSA;

class Node {
    int data;
    Node next;
                  Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class Linkedlist {
            Node head;
//method to check size(length) of the linked list
    public int size() {
  int count = 0;
  Node current = head;
  while (current != null) {
  count++;
  current = current.next;}
 return count;
    }
//method to insert a value at a given index
    public void insertAtIndex(int value, int index) {
        if (index < 1 || index > size() + 1) { 
            System.out.println("invalid index");
            return;
        }
        Node newNode = new Node(value);
        if (index == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 2; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
  //  Method to delete at specific index
    public void deleteAtIndex(int index) {
        if (index < 1 || index > size()) {
            System.out.println("Invalid index");
            return; }
        if (index == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 0; i < index - 2; i++) {
            current = current.next;
        }
        Node nodeToDelete = current.next;
        current.next = current.next.next;
        nodeToDelete = null;
    }
//method to delete after a given node
    public void deleteAfterNode(Node prevnode) {
        if (prevnode == null || prevnode.next == null) {
            System.out.println("Invalid position");
            return;}
        Node nodeToDelete = prevnode.next;
        
        prevnode.next = prevnode.next.next;
        nodeToDelete = null;
        }
//method to search for a node given the data it contains
public int search(int data) {
	Node current = head;
	int index = 1;
     while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
  }
//main method to test code on
public static void main(String[] args) {
	Linkedlist list=new Linkedlist();
	list.insertAtIndex(1, 1);
	list.insertAtIndex(2, 1);
	list.insertAtIndex(3, 2);
	list.deleteAtIndex(1);
	list.deleteAfterNode(list.head);

	

}
}

