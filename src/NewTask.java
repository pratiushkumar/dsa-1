import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.SubmissionPublisher;

public class NewTask
{
    private long load  =  0;
    public NewTask(long load) {
        this.load =  load;

    }
    protected void compute() {
        //fork getting divided into smaller parts
        List<NewTask> subtaskstore =  new ArrayList<>();
        subtaskstore.addAll(createSubtasks());

        for(RecursiveAction taskstore:  subtaskstore) {
            taskstore.fork();
        }

    }
    //function to create add subtasks
    private List<NewTask> createSubtasks() {
        List<NewTask> Subtasks = new ArrayList<>();
        NewTask subtask1 =  new NewTask(this.load/2);
        NewTask subtask2 = new NewTask(this.load/2);
        NewTask subtask3 =  new NewTask(this.load/3);
    //add tasks
        Subtasks.add(subtask1);
        Subtasks.add(subtask2);
        Subtasks.add(subtask3);
        return Subtasks;
    }

}

