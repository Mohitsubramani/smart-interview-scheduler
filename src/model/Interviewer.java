package model;

public class Interviewer {

    private int id;
    private String name;
    private TimeSlot availability;

    public Interviewer(int id, String name, TimeSlot availability) {
        this.id = id;
        this.name = name;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TimeSlot getAvailability() {
        return availability;
    }
}
