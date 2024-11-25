package main.model;

public class Booking {
    private int bookingId;
    private User user;
    private Train train;
    private int seatNumber;

    public Booking(int bookingId, User user, Train train, int seatNumber) {
        this.bookingId = bookingId;
        this.user = user;
        this.train = train;
        this.seatNumber = seatNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String toString() {
        return  "      Booking ID            : " + bookingId + "\n"+
                "      User Name             : " + user.getUsername() + "\n"+
                "      Train number          : " + train.getTrainNumber() + "\n"+
                "      Train Name            : " + train.getTrainName() + "\n"+
                "      Origin                : " + train.getOrigin()+ "\n"+
                "      Destination           : " + train.getDestination() + "\n"+
                "      Train Boarding Time   : " + train.getTime()+ "\n";
    }

    public void DisplayBookingDtails() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("       Booking ID    : " + bookingId);
        Thread.sleep(1000);
        System.out.println( "        User Name    : " + user.getUsername());
        Thread.sleep(1000);
        System.out.println( "     Train number    : " + train.getTrainNumber());
        Thread.sleep(1000);
        System.out.println("        Train Name   : " + train.getTrainName());
        Thread.sleep(1000);
        System.out.println( "         Origin      : " + train.getOrigin());
        Thread.sleep(1000);
        System.out.println("       Destination   : " + train.getDestination());
        Thread.sleep(1000);
        System.out.println("       Seat Number   : " + seatNumber);
        Thread.sleep(1000);
        System.out.println("       Train time    : " + train.getTime());

    }
}
