package model;

public class TimeSlot {
    private int start;
    private int end;

    public TimeSlot(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public boolean overlaps(TimeSlot other) {
        return this.start < other.end && other.start < this.end;
    }
}
