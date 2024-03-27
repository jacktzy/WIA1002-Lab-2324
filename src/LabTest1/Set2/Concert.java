package LabTest1.Set2;

public class Concert extends Event {
    private String bandName;

    public Concert(String eventId, String eventName, String eventDate, String bandName) {
        super(eventId, eventName, eventDate);
        this.bandName = bandName;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("Concert - ID: " + this.eventId + ", Name: " + this.eventName + ", Date: " + this.eventDate + ", Band: " + this.bandName);
    }
}
