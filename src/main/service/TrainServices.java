package main.service;

import main.model.Station;
import main.model.Train;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TrainServices extends UserServices{

  static  HashMap<Integer, Train> trains=new HashMap<Integer, Train>();

    Scanner sc=new Scanner(System.in);


  static public void preDefinedTrains(){
        trains.put(12101,new Train(12101, "JANANESWARI EXP",
                Station.LOKMANYATILAK,Station.KOLKATA,
                80, LocalTime.of(20, 35)));

        trains.put(12102, new Train(12102,
                "JANANESWARI EXP",              // train 1 up
                Station.KOLKATA,Station.LOKMANYATILAK,
                72, LocalTime.of(6, 5)));

//            -----------------------------------------------

        trains.put(12860, new Train(12860,
                "GITANJALI EXP",                // train 2 down
                Station.MUMBAI_CENTRAL,Station.KOLKATA,
                72, LocalTime.of(11, 10)));

        trains.put(12859, new Train(12859,
                "GITANJALI EXP",              // train 2 up
                Station.KOLKATA,Station.MUMBAI_CENTRAL,
                72, LocalTime.of(22, 50)));

//            -------------------------------------------------

        trains.put(22692, new Train(22692,
                "SBC RAJDHANI",              // train 3 up
                Station.DELHI,Station.BENGALURU,
                60,LocalTime.of(9, 10)));

        trains.put(22691, new Train(22691,
                "SBC RAJDHANI",          // train 3 down
                Station.BENGALURU,Station.DELHI,
                60,LocalTime.of(13, 0)));

//            ---------------------------------------------

        trains.put(12870, new Train(12870,
                "HWH CSMT SF EXP",          // train 4 down
                Station.KOLKATA,Station.LOKMANYATILAK,
                48,LocalTime.of(11, 5)));

        trains.put(12869, new Train(12871,
                "CSMT HWH SF EXP",          // train 4 down
                Station.LOKMANYATILAK,Station.KOLKATA,
                48,LocalTime.of(3, 45)));

//            -------------------------------------------------

        trains.put(20840, new Train(20840,
                "VANDE BHARAT",          // train 5 down
                Station.DELHI,Station.HYDERABAD,
                60,LocalTime.of(0, 25)));

        trains.put(20841, new Train(20841,
                "VANDA BHARAT",          // train 5 down
                Station.HYDERABAD,Station.DELHI,
                60,LocalTime.of(13, 0)));

      //            -------------------------------------------------

      trains.put(22228, new Train(22228,
              "RAJDHANI",          // train 6 up
              Station.HYDERABAD,Station.DELHI,
              82,LocalTime.of(11, 15)));

      trains.put(22227, new Train(22227,
              "RAJDHANI",          // train 6 down
              Station.DELHI,Station.HYDERABAD,
              82,LocalTime.of(20, 35)));

      //            -------------------------------------------------

      trains.put(12261, new Train(12261,
              "HOWRAH DURONTO",                // train 7 down
              Station.MUMBAI_CENTRAL,Station.KOLKATA,
              36, LocalTime.of(22, 55)));

      trains.put(12262, new Train(12262,
              "HOWRAH DURONTO",              // train 7 up
              Station.KOLKATA,Station.MUMBAI_CENTRAL,
              36, LocalTime.of(23, 17)));

      //            -------------------------------------------------

      trains.put(22511, new Train(22511,
              "JAN SATABDI EXP",                // train 8 down
              Station.MUMBAI_CENTRAL,Station.KOLKATA,
              80, LocalTime.of(13, 15)));

      trains.put(22512, new Train(22512,
              "JAN SATABDI EXP",              // train 8 up
              Station.KOLKATA,Station.MUMBAI_CENTRAL,
              80, LocalTime.of(11, 52)));

      //            -------------------------------------------------

      trains.put(20821, new Train(20821,
              "HUMSAFR",                    // train 9 down
              Station.KOLKATA,Station.LOKMANYATILAK,
              120,LocalTime.of(13, 5)));

      trains.put(20822, new Train(20822,
              "HUMSAFR",                  // train 9 down
              Station.LOKMANYATILAK,Station.KOLKATA,
              120,LocalTime.of(18, 35)));

//      -------------------------------------------------------------------

      trains.put(12265, new Train(12265,
              "SDAH DURONTO",                // train 10 down
              Station.DELHI,Station.KOLKATA,
              72, LocalTime.of(19, 45)));

      trains.put(12264, new Train(12264,
              "SDAH DURONTO",              // train 10 up
              Station.KOLKATA,Station.DELHI,
              72, LocalTime.of(14, 15)));

      //            ---------------------------------------------

      trains.put(12314, new Train(12314,
              "RAJDHNI",          // train 11 down
              Station.KOLKATA,Station.LOKMANYATILAK,
              60,LocalTime.of(16, 35)));

      trains.put(12315, new Train(12315,
              "RAJDHNI",          // train 11 down
              Station.LOKMANYATILAK,Station.KOLKATA,
              60,LocalTime.of(10, 10)));

      //            ---------------------------------------------

      trains.put(12456, new Train(12456,
              "ORIENT EXPRESS",          // train 12 down
              Station.BENGALURU,Station.DELHI,
              72,LocalTime.of(16, 35)));

      trains.put(12457, new Train(12457,
              "ORIENT EXPRESS",          // train 12 down
              Station.DELHI,Station.BENGALURU,
              72,LocalTime.of(10, 10)));

//            ---------------------------------------------

      trains.put(22334, new Train(22334,
              "VANDE BHARAT EXPRESS",          // train 13 down
              Station.BENGALURU,Station.DELHI,
              60,LocalTime.of(16, 35)));

      trains.put(22335, new Train(22335,
              "VANDE BHARAT EXPRESS",          // train 13 down
              Station.DELHI,Station.BENGALURU,
              60,LocalTime.of(10, 10)));

//            ---------------------------------------------

      trains.put(15987, new Train(15987,
              "GOLDEN CHARIOT",          // train 14 down
              Station.MUMBAI_CENTRAL,Station.DELHI,
              120,LocalTime.of(16, 35)));

      trains.put(15988, new Train(15988,
              "GOLDEN CHARIOT",          // train 14 down
              Station.DELHI,Station.MUMBAI_CENTRAL,
              120,LocalTime.of(10, 10)));


//            ---------------------------------------------

      trains.put(47865, new Train(47865,
              "HIMSAGAR EXPRESS",          // train 14 down
              Station.HYDERABAD,Station.DELHI,
              120,LocalTime.of(16, 35)));

      trains.put(47866, new Train(47866,
              "HIMSAGAR EXPRESS ",          // train 14 down
              Station.DELHI,Station.HYDERABAD,
              120,LocalTime.of(10, 10)));




  }

    public void getAllTrains(){
        for (Train train : trains.values()) {
            System.out.println(train);
        }
    }

    public void getTrainByStations(String origin,String destination){
        for (Train train : trains.values()) {
            if (train.getOrigin().equals(origin) && train.getDestination().equals(destination)) {
                System.out.println(train);
            }
        }
    }
    
    public void getTrainBySingleStation(String station){
        Iterator<Train> trainIterator=trains.values().iterator();
        while(trainIterator.hasNext()){
            Train train=trainIterator.next();
            if(train.getOrigin().equals(station) ||  train.getDestination().equals(station) ){
                System.out.println(train);
            }
        }
    }

    public Train getTrainBytrainNum(int trainNumber){
      Train train=trains.get(trainNumber);
      if(train==null){
          System.out.println("Please enter correct Train number ");
          System.out.println("Enter train number ");
          getTrainBytrainNum(sc.nextInt());
      }
        System.out.println("    Train Details     ");
        return train;
    }


}
