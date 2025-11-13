//The recruitment event 
public class RecruitmentEvent implements RecruitHandler, Event{
    private String name;
    private String location;
    private String date;
    private String time;
    private double duration;
    private String company;
    private String position;
    
    //constructor added for initilizing the object 
    public RecruitmentEvent(String name, String location, String date, String time,
    double duration, String company, String position){
        this.name=name;
        this.location=location;
        this.date=date;
        this.time=time;
        this.duration=duration;
        this.company=company;
        this.position=position;
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
    public String getCompany() {
        return company;
    }
     @Override
    public String getPosition() {
        return position;
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

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //toString method 
    @Override
    public String toString(){
        return "Event Name:" + name + "\n" +
               "Location:" + location + "\n" +
               "Date:" + date + "\n" +
               "Time:" + time+ "\n" +
               "Duration:" + duration+ "\n" +
               "Name of the company:" + company+ "\n" +
               "Position Name:" + position + "\n";
             }

}

