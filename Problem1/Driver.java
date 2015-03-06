public class Driver {

    public static void main(String[] args) {
        SubmissionQueue sq1 = SubmissionQueue.getSubmissionQueue();
        SubmissionQueue sq2 = SubmissionQueue.getSubmissionQueue();

        System.out.println("Adding to SQ1...");
        for(int i = 0 ; i < 2 ; i++){
            sq1.add(new Submission());
        }
        System.out.println("Adding to reference SQ2...");
        for(int i= 0 ; i < 3 ; i++){
            sq2.add(new Submission());
        }

        // Should equal first submission
        System.out.println("Popping from submission queue statically, should be first element added.");
        sq1.process();

        System.out.println("Popping from second submission queue, should be second element added.");
        sq2.process();
        System.out.println("Popping from SQ 1 again, should be third element added.");
        sq1.process();
        // Get new submission queue, should return the same instance
        System.out.println("Getting new submission queue, should be same instance.");
        SubmissionQueue sq3 = SubmissionQueue.getSubmissionQueue();
        System.out.println("Popping off SQ 3, should be second to last element added.");
        sq3.process();
        System.out.println("Popping off initial SQ again, should be last element added.");
        sq1.process();
        System.out.println("Popping off one last time, should be empty");
        sq2.process();
    }
}
