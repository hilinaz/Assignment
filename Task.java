package ToDo;
public class Task {
	//declaring all attributes
 String title;
 String description;
 boolean completed;
//creating a constructor for Task class
 public Task(String title, String description) {
   this.title = title;
   this.description = description;
    this.completed = false;
    }
// method to return title of the Task object it was called on
public String getTitle() {
    return title;
    }
// Method to get description of task object
public String getDescription() {
       return description;
    }
// method to check if a task is complete
public boolean isCompleted() {
     return completed;
    }
 // method to mark a task complete
public void markCompleted() {
    this.completed = true;
    }
}