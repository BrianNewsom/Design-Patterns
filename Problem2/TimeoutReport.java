
public class TimeoutReport implements Report {
    private int timeouts = 0;
    private Submission submission;

    public TimeoutReport(Submission s){
        this.submission = s;
    }

    public void incTimeouts(){
        System.out.println("Test timed out.");
        timeouts++;
    }

    public int getTimeouts(){
        System.out.println(timeouts + " Tests timed out");
        return timeouts;
    }
    public void update(boolean pass){
        if(!pass){
            // Check if timeout error
            boolean timeout = this.submission.wasTimeoutError();
            if(timeout){
                incTimeouts();
            }
        }
    }

}
