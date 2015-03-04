
public class CorrectReport implements Report {
    private int passedTests = 0;

    public int getPassedTests() {
        return passedTests;
    }

    public void incPassedTests() {
        System.out.println("Passed test case.");
        this.passedTests++;
    }

    public void printResults() {
        System.out.println(this.getPassedTests() + " Correctly passed test cases.");
    }

    public void update(boolean pass){
        if(pass){
            incPassedTests();
        }
    }

}
