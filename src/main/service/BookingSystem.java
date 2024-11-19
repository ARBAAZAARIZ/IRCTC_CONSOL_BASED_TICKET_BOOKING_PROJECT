package main.service;

import main.model.Booking;
import main.model.Train;
import main.model.User;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class BookingSystem extends TrainServices {

      static HashMap<Integer, Booking> bookings =new HashMap<>();
      Random random=new Random();
    Scanner sc=new Scanner(System.in);

      public void preDefinedBookings(){
          bookings.put(778176, new Booking(7781, getUserByUserName("kaiparker"),
                  getTrainBytrainNum(22692), 45));

          bookings.put(859123, new Booking(859123, getUserByUserName("bonnie"),
                  getTrainBytrainNum(22692), 32));

          bookings.put(907834, new Booking(907834, getUserByUserName("klaus"),
                  getTrainBytrainNum(12870), 32));

          bookings.put(9699677, new Booking(9699677, getUserByUserName("kolmikelson"),
                  getTrainBytrainNum(20841), 15));

          bookings.put(845605, new Booking(845605, getUserByUserName("caroline"),
                  getTrainBytrainNum(12870), 23));

          bookings.put(999999, new Booking(999999, getUserByUserName("tyler"),
                  getTrainBytrainNum(22691), 40));

          bookings.put(776655, new Booking(776655, getUserByUserName("damon"),
                  getTrainBytrainNum(12859), 16));

          bookings.put(123407, new Booking(123407, getUserByUserName("elana"),
                  getTrainBytrainNum(12870), 54));

          bookings.put(978123, new Booking(978123, getUserByUserName("stefan"),
                  getTrainBytrainNum(12859), 30));

          bookings.put(118684, new Booking(118684, getUserByUserName("elana"),
                  getTrainBytrainNum(12859), 9));

      }






    public int mainMenu(){
        System.out.println("Welcome to Main Menu ");
        System.out.println("1. Account related services");
        System.out.println("2. Trains related service");
        int choice =sc.nextInt();
        if(choice==1){
            return 1;
        } else  {
            return 2;
        }
    }


    public void addBooking(User user,int trainNumber){
        Train train=getTrainBytrainNum(trainNumber);
        int seatNum=random.nextInt(1,80);
        int bookingId= random.nextInt(100000,900000);

        bookings.put(bookingId, new Booking(bookingId,user,train,seatNum));
        System.out.println("  Your booking details  ");
        Booking booking = bookings.get(bookingId);
        try {
            booking.DisplayBookingDtails();
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("  !!     Happy Journey     !!");
    }


}
