package oley.tasks;

public class Todo extends Task {
    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String format() {
        if (getDoneList()) {
            return "1todo " + getTaskName();
        } else {
            return "0todo " + getTaskName();
        }
    }
}
