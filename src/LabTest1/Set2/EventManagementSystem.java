package LabTest1.Set2;

import java.io.BufferedReader;
import java.io.FileReader;

public class EventManagementSystem {
    public static void main(String[] args) {
        EventManager<Event> eventManager = new EventManager<>();
        try {
            FileReader fileReader = new FileReader("src/LabTest1/Set2/events.txt");
            BufferedReader inputStream = new BufferedReader(fileReader);
            String line;
            while ((line = inputStream.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                switch (type) {
                    case "Concert":
                        eventManager.addEvent(new Concert(parts[1], parts[2], parts[3], parts[4]));
                        break;

                    case "Workshop":
                        eventManager.addEvent(new Workshop(parts[1], parts[2], parts[3], parts[4], parts[5]));
                        break;

                    case "SportsGame":
                        eventManager.addEvent(new SportsGame(parts[1], parts[2], parts[3], parts[4]));
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error when reading file: " + e);
        }
        eventManager.displayEvents();
    }
}
