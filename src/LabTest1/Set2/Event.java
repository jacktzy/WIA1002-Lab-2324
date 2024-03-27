package LabTest1.Set2;

public abstract class Event {
    protected String eventId;
    protected String eventName;
    protected String eventDate;

    public Event(String eventId, String eventName, String eventDate) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public abstract void displayEventDetails();
}
