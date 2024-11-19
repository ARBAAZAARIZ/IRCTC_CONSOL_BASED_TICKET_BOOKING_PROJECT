package main;


import main.model.User;
import main.model.UserNotFoundException;
import main.service.BookingSystem;
import main.service.TrainServices;
import main.service.UserServices;

import java.util.Scanner;

public class MainApplication {

    static BookingSystem bookingSystem=new BookingSystem();
      static  Scanner sc=new Scanner(System.in);

      static{
          System.out.println();
          System.out.println("                  Welcome to the IRCTC Ticket" +
                  " Management System!  Ready to streamline your travel plans.");
          System.out.println();
          UserServices.definedUser();
          TrainServices.preDefinedTrains();
          BookingSystem.preDefinedTrains();
      }

    public static void main(String[] args) {
        System.out.println("New User? To register, press '1'.");
        System.out.println("Already a user? To log in, press '2'.");
        System.out.println("To exit, press '3'. ");
        User user=null;

        int choice=sc.nextInt();

        if(choice==1){
          user= bookingSystem.register();
        } else if (choice==2) {
           user =  bookingSystem.login();
        } else if (choice==3) {
          System.exit(0);
        }

        if(user==null){
            System.out.println("You can't proceed any further from here.");
            throw new UserNotFoundException("  User not found. Please check the entered " +
                    "details and try again.");
        }
        int option=bookingSystem.mainMenu();

        if(option==1){
//            that means user chosen account-based service
            System.out.println(" To change your password, press '1'. ");
            System.out.println("To delete your account, press '2'.  ");
            if(sc.nextInt()==1){
                bookingSystem.changePassword(user);
            }else{
                bookingSystem.deleteAccount(user);
            }

        }else{
//            user chosen for train service
            System.out.println("Press '1' View Trains by Origin and Destination Stations ");
//            View Trains by a Single Station
            System.out.println("Press '2' View Trains by Single Station ");
//            view train by train number
            System.out.println("Press '3' View Trains by Train number ");
            option= sc.nextInt();
            if(option==1){
//                user chosen 1 to get trains for by stations
                System.out.println("Please enter your origin station for the journey.");
                String origin=sc.next();
                System.out.println("Please enter your destination station for ticket booking.");
                String destination=sc.next();
                bookingSystem.getTrainByStations(origin,destination);
                System.out.println("If you want to book a ticket, press 'T'. Otherwise, press 'F'.");
                char o=sc.next().charAt(0);

                if(o=='t' || o=='T'){
                    System.out.println("Please enter the train number for the ticket you wish to book.");
                    int trainNumber=sc.nextInt();
                    bookingSystem.addBooking(user,trainNumber);
                } else if (o == 'f' || o=='F') {
                    System.exit(0);

                }else{
                    System.out.println("Wrong input, please try again !!");
                }

            } else if (option==2) {
//                user chose 3 to get trains by single train station
                System.out.println(" Please enter your station name");
                String sts= sc.next();
                bookingSystem.getTrainBySingleStation(sts);

                System.out.println("If you want to book a ticket, press 'T'. Otherwise, press 'F'.");
                char o=sc.next().charAt(0);

                if(o=='t' || o=='T'){
                    System.out.println("Please enter the train number for the ticket you wish to book.");
                    int trainNumber=sc.nextInt();
                    bookingSystem.addBooking(user,trainNumber);
                } else if (o == 'f' || o=='F') {
                    System.exit(0);

                }else{
                    System.out.println("Wrong input, please try again !!");
                }


            } else if (option==3) {
//                user chose 3 to get trains by train number
                System.out.println("Please enter your train number to proceed.r");
                int trainNumber=sc.nextInt();

                System.out.println( bookingSystem.getTrainBytrainNum(trainNumber)); //getTrainBytrainNum
                System.out.println("If you want to book a ticket, press 'T'. Otherwise, press 'F'. ");
                char o=sc.next().charAt(0);
                if(o=='t'){
                    bookingSystem.addBooking(user,trainNumber);
                } else if (o=='f') {
                    System.exit(0);

                }else{
                    System.out.println("Wrong input, please try again !!");
                }

            }


        }




    }
}
