package ToDo;
public class Node {
	//declaring attributes
 Task task;
 Node next;
// creating a constructor for node class
public Node(Task task) {
    this.task = task;
    this.next = null;
    }
}