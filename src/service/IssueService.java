package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("Server Crash", 1));      // Самая срочная
        issues.add(new Issue("Password Reset", 5));   // Наименее срочная
        issues.add(new Issue("Course Enrollment Error", 2));
        issues.add(new Issue("Library Fine Dispute", 4));
        issues.add(new Issue("Missing Grade", 3));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if(!issues.isEmpty()){
            System.out.println(issues.peek());
        }
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        if(issues.size() >= 2){
        for(int i = 0;i<2;i++){
            if(!issues.isEmpty()){
                Issue removed = issues.poll();
                System.out.println("first issue is removed");
            } else {
                System.out.println("no more issues to resolve");
            }
            }
        }

    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        Iterator<Issue> it = issues.iterator();

        // Iterate over the elements using the iterator and print them
        System.out.println("Elements of the PriorityQueue (unordered):");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }

    public void addNewIssue(String description, int urgency) {
        // TODO: Add new issue
        issues.add(new Issue(description,urgency));
        System.out.println("Issue: " + description + "-----was added");
    }
}
