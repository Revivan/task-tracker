public class Task {
    private String name;
    private boolean taskDone;

    public Task(String nameIn) {
        name = nameIn;
        taskDone = false;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return taskDone;
    }

    public void setDone() {
        taskDone = true;
    }
}
