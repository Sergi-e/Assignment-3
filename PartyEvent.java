//Class PartyEvent
public class PartyEvent implements PartyHandler, Event{
    private String name;
    private String location;
    private String date;
    private String time;
    private double duration;
    private String theme;
    private String dressCode;
    
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
    public String getTheme() {
        return theme;
    }
    @Override
     public String getDressCode() {
        return dressCode;
    }

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

    public void setTheme(String theme) {
        this.theme = theme;
    }
    public void setDressCode(String dressCode) {
        this.dressCode = dressCode;
    }

    //toString method
    @Override
    public String toString(){
        return "Event Name:" + name + "\n" +
               "Location:" + location + "\n" +
               "Date:" + date + "\n" +
               "Time:" + time+ "\n" +
               "Duration:" + duration+ "\n" +
               "Party Theme:" + theme+ "\n" +
               "Dress code:" + dressCode +"\n";
            }
}



