
public class Driver {

    public static void main(String[] args) {
        System.out.println("Testing autograder observer....");
        Submission s = new Submission();
        for (int i = 0 ; i < 21 ; i++){
            s.runTestCase();
            if(i % 5 == 0) s.printAllReports();
        }
    }
}
