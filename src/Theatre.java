import java.util.*;
public class Theatre {
    private String name;
    private String location;
    private int seatingCapacity;
    private List<String> seats;

    public Theatre(String name, String location, List<String> seats, int seatingCapacity)
    {
        this.name =name;
        this.location =location;
        this.seats = seats;
        this.seatingCapacity = this.seats.size();
    }

    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public List<String> getSeats() {
        return seats;
    }
    public int getSeatingCapacity() {
        return seatingCapacity;
    }
}
