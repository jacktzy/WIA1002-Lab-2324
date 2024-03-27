package LabTest1.Set2;

public class Workshop extends Event {
    private String topic;
    private String instructor;

    public Workshop(String eventId, String eventName, String eventDate, String topic, String instructor) {
        super(eventId, eventName, eventDate);
        this.topic = topic;
        this.instructor = instructor;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Workshop - ID: " + this.eventId + ", Name: " + this.eventName + ", Date: " + this.eventDate + ", Topic: " + this.topic + ", Instructor: " + this.instructor);
    }
}
