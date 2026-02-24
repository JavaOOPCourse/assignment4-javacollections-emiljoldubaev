package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.push("Submitted Assignment");
        actions.push("Dropped course");
        actions.push("Registered course");
        actions.push("Updated profile");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if(!actions.isEmpty()){
            actions.pop();
        } else {
            System.out.println("No actions to undo");
        }
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.push("Requested Transcript");

    }

    public void showFirstAndLast() {
        // TODO: Print first and last action
        if(!actions.isEmpty()){
            System.out.println("First (Recent): "+ actions.peekFirst());
            System.out.println("Last (Oldest): "+actions.peekLast());
        }
    }

    public void printHistory() {
        // TODO: Iterate through history
        Iterator<String> it = actions.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        }

}
