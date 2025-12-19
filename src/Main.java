import model.*;
import scheduler.InterviewScheduler;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Candidate> candidates = new ArrayList<>();
        List<Interviewer> interviewers = new ArrayList<>();

        candidates.add(new Candidate(1, "Arun",
                new TimeSlot(10, 11)));
        candidates.add(new Candidate(2, "Bala",
                new TimeSlot(11, 12)));

        interviewers.add(new Interviewer(1, "Ravi",
                new TimeSlot(10, 12)));
        interviewers.add(new Interviewer(2, "Kumar",
                new TimeSlot(11, 13)));

        InterviewScheduler scheduler = new InterviewScheduler();
        scheduler.scheduleInterviews(candidates, interviewers);
    }
}
