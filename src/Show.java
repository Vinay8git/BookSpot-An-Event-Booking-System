public class Show {
    private Movie movieName;
    private Theatre theatreName;
    private Showtime showTime;
    private int availableSeats;

    public Show(Movie movie, Theatre theatreName, Showtime showtime)
    {

    }
    public Movie getMovieName() {
        return movieName;
    }
    public Showtime getShowTime() {
        return showTime;
    }
    public Theatre getTheatreName() {
        return theatreName;
    }
    public int getAvailableSeats() {
        return availableSeats;
    }
}
