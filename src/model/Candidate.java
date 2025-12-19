package model;

public class Candidate {

    private int id;
    private String name;
    private TimeSlot availability;

    public Candidate(int id, String name, TimeSlot availability) {
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
