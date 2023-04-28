package week12statePattern.blame;

public interface Blameable {
    public Blameable taskIssue();
    public Blameable quizIssue();
    public Blameable interviewIssue();
    public void applyBlame();
}
