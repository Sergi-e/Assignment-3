import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        //Objects for TalkEvent
        TalkEvent talk1=new TalkEvent(
            "Meeting With Selasie",
            "RB 100",
            "14 November, 2024",
            "16:30 p.m",
            1.30,
            "Selasi Nukpe",
            "The event will specifically target the Class of 2028. Since they are about to go on a long break." +
            "they will be advised on how to make the most of their vacation."
        );
        TalkEvent talk2=new TalkEvent(
            "Town hall Event",
            "The confield & Asher courtyard",
            "27 November, 2025",
            "3:00 p.m",
            2.30,
            "Dr. Patrick Awuah",
            "This is the meeting between Dr Patrick and Ashesi students. It's a space for the students to mention their" +
            "constructive ideas and questions that need to be addressed. This is one of the most important meetings at Ashesi."
        );
        
        //objects for SportsEvent
        SportsEvent sport1=new SportsEvent(
            "Ashesi Varsity League",
            "Ashesi Football Pitch",
            "16 November, 2025",
            "8:00 a.m",
            3.00,
            "Ashesi School Team",
            "Academic City Team",
            "Football"
        );
        SportsEvent sport2=new SportsEvent(
            "ABA Tournament",
            "New basketball court",
            "26th November, 2025",
            "18:30 p.m",
            3.00,
            "Ashnights",
            "Losh Astros",
            "Basketball"
        );

        //objects for PartyEvent
        PartyEvent party1=new PartyEvent(
            "Ubora Event",
            "Accra Hotel",
            "10 December, 2025",
            "8:00 p.m",
            4.00,
            "Let's Celebrate Those Who Make Our Campus a Vibe",
            "Black and White"
        );
        PartyEvent party2=new PartyEvent(
            "ASC Week Friday",
            "New Car Park",
            "20 December, 2025",
            "9:00 p.m",
            6.00,
            "If You no dey Vibe, you no dey Inside",
            "Anything"
        );

        //Objects for RecruitmentEvent
        RecruitmentEvent recruit1=new RecruitmentEvent(
            "Ashesi Innovative Experience",
            "The Hive Banquet Hall",
            "30 December, 2025",
            "10:00 a.m",
            5.30,
            "AmaliTech Ltd",
            "Robotics Trainer"
        );
        RecruitmentEvent recruit2=new RecruitmentEvent(
            "Career Fair",
            "New Car Park",
            "16th March, 2025",
            "8:00 a.m",
            8.00,
            "More than 63 Companies",
            "More than 100 internships and 50 jobs"
        );

        // Storing events in a list 
        ArrayList<Object> allEventsList=new ArrayList<>();
        allEventsList.add(talk1);
        allEventsList.add(talk2);
        allEventsList.add(sport1);
        allEventsList.add(sport2);
        allEventsList.add(party1);
        allEventsList.add(party2);
        allEventsList.add(recruit1);
        allEventsList.add(recruit2);

        //Displaying events
        System.out.println("-----Here is the calendar for Ashesi Events------");
        for(Object event: allEventsList){
            System.out.println(event.toString());
            System.out.println("------------------------");
        }
    }  
}