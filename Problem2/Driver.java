
public class Driver {

    public static void main(String[] args) {
        System.out.println("Testing autograder observer....");
        Submission s = new Submission();
        Report cr = new CorrectReport();
        Report tor = new TimeoutReport(s);
        s.attach(cr);
        s.attach(tor);
        for (int i = 0 ; i < 21 ; i++){
            s.runTestCase();
            if(i % 5 == 0) s.printAllReports();
        }
    }
}
