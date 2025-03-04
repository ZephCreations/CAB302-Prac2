public class ToDoItem {
    private String description;
    private boolean isDone;

    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    public ToDoItem (String description){
        this.description = description;
        this.isDone = false;
    }

    // Getter for Description
    public String getDescription() {
        return description;
    }
    // Setter for Description
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter for isDone
    public boolean getisDone(boolean isDone) {
        return isDone;
    }
    // Setter for isDone
    public void setisDone(boolean isDone) {
        this.isDone = isDone;
    }

}