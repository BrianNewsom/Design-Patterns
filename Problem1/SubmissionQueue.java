import java.util.LinkedList;
import java.util.Queue;

public class SubmissionQueue {
    // Actual FIFO queue to store submissions
    private static Queue<Submission> myQueue;
    private static SubmissionQueue mySubmissionQueue;

    //Empty Constructor
    private SubmissionQueue() {
      myQueue = new LinkedList<Submission>();
    }


    public static SubmissionQueue getSubmissionQueue() {
        // If we really want to be correct I think we have to do some java magic here to allow multithreading.
        if (mySubmissionQueue == null){
            mySubmissionQueue = new SubmissionQueue();
        }
        return mySubmissionQueue;
    }

    public void add(Submission s){
        getSubmissionQueue().myQueue.add(s);
        System.out.println("Added submission to queue: " + s);
    }

    public Submission process(){
        // Get next element
        Submission s = getSubmissionQueue().myQueue.poll();
        if(s == null){
            System.out.println("Queue empty, nothing removed.");
        } else {
            System.out.println("Removed from queue: " + s);
        }
        return s;
    }
}
