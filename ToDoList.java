package ToDo;
public class ToDoList {
    Node head;
// method for the to-do constructor
public ToDoList() {
  this.head = null; }

//method to add task to the to do list 
public void addToDo(Task task) {
  Node newNode = new Node(task);
    if (head == null) {
        head = newNode;
        return;
    }
    Node current = head;
    while (current.next != null) {
            current = current.next;
   }
    current.next = newNode;
    }

//method to mark a task complete
public void markToDoAsCompleted(String title) {
    if (head == null) {
       return;
     }
    if (head.task.title.equals(title)) {
       head.task.markCompleted();
       return;
        }
    Node current = head;
    while (current.next != null) {
      if (current.next.task.title.equals(title)) {
          current.next.task.markCompleted();
            return;
            }
            current = current.next;
        }
   System.out.println("Task not found");
    }
//method to view all the task in the to-do list
public void viewToDoList() {
   if (head == null) {System.out.println("To-Do list is empty");
            return;
        }
  Node current = head;
       while (current != null) {
      Task task = current.task;
     System.out.println("title:" + task.title);
      System.out.println("description: " + task.description);
     System.out.println("completed: " + task.isCompleted());
     System.out.println();
      current = current.next;
      }
    }
//main method to test function of the to do list application
public static void main(String[] args) {
   ToDoList todo = new ToDoList();
   todo.addToDo(new Task("day 01", "finish all assignments"));
   todo.markToDoAsCompleted("day 01");
        todo.viewToDoList();
    }
}