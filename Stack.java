package OOP;
public class Stack {
	//declaring class attribute for stack
    Node top;
   
    public class Node {
        int value;
        Node next;
        //creating a node constructor
Node(int value) {
  this.value = value;
  this.next = null;}
    }
    
 //creating a stack constructor
 public Stack() {
    this.top = null;
    }
//method for entering values
 public void push(int value) {
    Node newNode = new Node(value);
    newNode.next = top;
    top = newNode;
    }
//method to remove values from the top
 public int pop() {
     if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1; }
     
        int value = top.value;
        top = top.next;
        return value;
    }
//method to peek at the element on top of the list
 public int peek() {
      if (isEmpty()) {
            System.out.println("Stack is empty");
         return -1;
          }
     return top.value;
      }
//method to check is stack is empty
 public boolean isEmpty() {
       return top == null;
    }
//main method to test function of the above code
 public static void main(String[] args) {
    Stack st=new Stack();
        st.push(3);
   System.out.println(st.peek());
   System.out.println(st.pop());
   System.out.println(st.isEmpty());
    }
}