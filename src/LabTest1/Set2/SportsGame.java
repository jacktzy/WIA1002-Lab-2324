package LabTest1.Set2;

public class SportsGame extends Event {
    private String gameType;

    public SportsGame(String eventId, String eventName, String eventDate, String gameType) {
        super(eventId, eventName, eventDate);
        this.gameType = gameType;
    }

    @Override
    public void displayEventDetails() {
        System.out.println("SportsGame - ID: " + this.eventId + ", Name: " + this.eventName + ", Date: " + this.eventDate + ", Type: " + this.gameType);

    }
}
