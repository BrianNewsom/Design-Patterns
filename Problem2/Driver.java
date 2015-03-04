
public class Driver {

    public static void main(String[] args) {
        System.out.println("Testing autograder observer....");
        Submission s = new Submission();
        for (int i = 0 ; i < 10 ; i++){
            s.runTestCase();

        }
    }
}
