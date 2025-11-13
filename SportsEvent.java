//The class SportsEvent
public class SportsEvent implements Event, SportsHandler {
    private String name;
    private String location;
    private String date;
    private String time;
    private double duration;
    private String team1;
    private String team2;
    private String sportType;

    

    //getters
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }
    public double getDuration() {
        return duration;
    }
    public String getTeam1() {
        return team1;
    }
    public String getTeam2() {
        return team2;
    }
    public String getSportType() {
        return sportType;
    }
}


