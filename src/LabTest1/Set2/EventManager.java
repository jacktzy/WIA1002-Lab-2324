package LabTest1.Set2;

import java.util.LinkedList;

public class EventManager<T extends Event> {
    LinkedList<T> events;

    public EventManager() {
        this.events = new LinkedList<>();
    }

    public void addEvent(T event) {
        events.add(event);
    }

    public void displayEvents() {
        for (T event : events) {
            event.displayEventDetails();
        }
    }
}
