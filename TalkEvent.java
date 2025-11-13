//The TalkEvent class
public class TalkEvent implements TalkHandler, Event {
   private String name;
    private String location;
    private String date;
    private String time;
    private double duration;
    private String speakerName;
    private String eventAbstract;
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
    public String getSpeakerName() {
        return speakerName;
    }
    @Override
    public String getEventAbstract() {
        return eventAbstract;
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

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public void setEventAbstract(String eventAbstract) {
        this.eventAbstract = eventAbstract;
    }
    
}
