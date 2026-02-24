package model;

public class Issue implements Comparable<Issue> {

    // TODO: declare fields
    private String description;
    private int urgencyLevel; // 1 = most urgent
    public Issue(String description,int urgencyLevel){
        this.description=description;
        this.urgencyLevel=urgencyLevel;
    }

    // TODO: create constructor

    // TODO: implement compareTo()
    @Override
    public int compareTo(Issue other) {
        // TODO: implement priority logic

        return Integer.compare(this.urgencyLevel, other.urgencyLevel);
    }
    @Override
    public String toString(){
        return "description: "+ description + "[urgency_level" + urgencyLevel + "]";
    }

    // TODO: override toString()
}
