//The class SportsEvent
public class SportsEvent implements SportsHandler, Event {
    private String name;
    private String location;
    private String date;
    private String time;
    private double duration;
    private String team1;
    private String team2;
    private String sportType;

    //setters
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }
    //getters
    @Override
    public String getName() {
        return name;
    }
    @Override
    public String getLocation() {
        return location;
    }
    @Override
    public String getDate() {
        return date;
    }
    @Override
    public String getTime() {
        return time;
    }
    @Override
    public double getDuration() {
        return duration;
    }
    @Override
    public String getTeam1() {
        return team1;
    }
    @Override
    public String getTeam2() {
        return team2;
    }
    @Override
    public String getSportType() {
        return sportType;
    }
    //Overriding toString 
    @Override
    public String toString(){
        return "Event Name:" + name + "\n" +
               "Location:" + location + "\n" +
               "Date:" + date + "\n" +
               "Time:" + time+ "\n" +
               "Duration:" + duration+ "\n" +
               "Name of the first team:" + team1 + "\n" +
               "Event of the second team:" + team2 + "\n" +
               "The type of sport:" + sportType + "\n";
             }
}


