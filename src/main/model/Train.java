package main.model;


import java.time.LocalTime;

public class Train {
    private Integer trainNumber;
    private String trainName;
    private String origin;
    private String destination;
    private Integer seatAvailable;
    private LocalTime time;





    public Train(Integer trainNumber, String trainName, Station origin,
                 Station destination, Integer seatAvailable, LocalTime time) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.origin = origin.name();
        this.destination = destination.name();
        this.seatAvailable = seatAvailable;
        this.time = time;
    }


    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Integer getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(Integer seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String toString(){
        return "\n"+"     train no      : "+trainNumber+" \n"+
               "    train name   : "+trainName+" \n"+
               "     origin      : "+origin+" \n"+
               "   destination     : "+destination+" \n"+
               "seat availability  : "+seatAvailable+" \n"+
               "       time        : "+time+" \n";
    }
}
