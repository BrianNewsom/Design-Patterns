
public interface AbstractSubmission {
    public void attach(Report r);
    public void detach(Report r);
    public void notifyReports(boolean pass);
}
