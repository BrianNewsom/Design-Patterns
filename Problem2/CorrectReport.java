
public class CorrectReport implements Report {
    private int passedTests = 0;

    public int getPassedTests() {
        System.out.println(passedTests + " Correctly passed test cases.");
        return passedTests;
    }

    public void incPassedTests() {
        System.out.println("Passed test case");
        this.passedTests++;
    }



    public void update(boolean pass){
        if(pass){
            incPassedTests();
        }
    }

}
