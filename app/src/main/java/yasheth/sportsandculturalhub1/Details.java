package yasheth.sportsandculturalhub1;

public class Details {
    private String subject, description;

    public Details() {
    }

    public Details(String subject, String description){
        this.subject = subject;
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}