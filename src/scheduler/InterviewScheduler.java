package scheduler;

import model.*;

import java.util.List;

public class InterviewScheduler {

    public void scheduleInterviews(List<Candidate> candidates,
                                   List<Interviewer> interviewers) {

        System.out.println("Interview Schedule:");

        for (Candidate candidate : candidates) {
            boolean scheduled = false;

            for (Interviewer interviewer : interviewers) {

                if (candidate.getAvailability()
                        .overlaps(interviewer.getAvailability())) {

                    System.out.println("Candidate "
                            + candidate.getName()
                            + " scheduled with Interviewer "
                            + interviewer.getName());

                    scheduled = true;
                    break;
                }
            }

            if (!scheduled) {
                System.out.println("No interviewer available for "
                        + candidate.getName());
            }
        }
    }
}
