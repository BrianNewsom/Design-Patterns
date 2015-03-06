
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
        return timeouts;
    }

    public void printResults(){
        System.out.println(this.getTimeouts() + " Tests timed out.");
    }

    public void update(boolean pass){
        if(!pass){
            // Check if timeout error
            boolean timeout = this.submission.wasTimeoutError();
            if(timeout){
                incTimeouts();
            } else{
                System.out.println("Fail but not timeout.");
            }
        }
    }

}
