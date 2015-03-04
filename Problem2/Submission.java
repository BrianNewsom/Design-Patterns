/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.ArrayList;
import java.util.Random;

public class Submission implements AbstractSubmission
{	
    private Random myRandom;
	private boolean lastErrorWasTimeout;
    private static ArrayList<Report> reports = new ArrayList<Report>();

    // You may add attributes to this class if necessary

	public Submission()
	{
	    myRandom = new Random();
		lastErrorWasTimeout = false;
        Report timeoutReport = new TimeoutReport(this);
        Report correctReport = new CorrectReport();
        attach(timeoutReport);
        attach(correctReport);
	}

    public void runTestCase()
	{
	    // For now, randomly pass or fail, possibly due to a timeout
		boolean passed = myRandom.nextBoolean();
		if(!passed)
		{
		    lastErrorWasTimeout = myRandom.nextBoolean();
		}

        // Notify in pass or fail case
        notifyReports(passed);
		// You can add to the end of this method for reporting purposes
	}

    public void attach(Report r){
        reports.add(r);
    }

    public void detach(Report r){
        reports.remove(r);
    }

    public void notifyReports(boolean pass){
        for(Report r : reports){
            r.update(pass);
        }
    }

    public void printAllReports(){
        System.out.println("------------PRINTING ALL RESULTS UP TO THIS POINT------------");
        for(Report r : reports){
            r.printResults();
        }
        System.out.println("-------------------------------------------------------------");
    }
	
    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}
}
