package main.service;

import main.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserServices {


 static private final HashMap<String, User> users=new HashMap<>();

  Scanner sc=new Scanner(System.in);
//   pre defined users
 static public void definedUser(){
      users.put("kaiparker",new User("kaiparker", "Kaiparker284"));
      users.put("bonnie", new User("bonnie", "Bonnie7886"));
      users.put("tyler",new User("tyler", "Tyler6782"));
      users.put("klaus",new User("klaus", "Klaus4245"));
      users.put("damon",new User("damon", "Damon9821"));
      users.put("stefan",new User("stefan", "Stefen6960"));
      users.put("kolmikelson",new User("kolmikelson", "kol81mike"));
      users.put("elana",new User("elana", "Elana077") );
      users.put("caroline", new User("caroline", "caroline65"));
      users.put("elijah", new User("elijah", "Elijah8903"));
  }



    //      returns true if username found else false
  boolean checkUser(String username){
     return users.containsKey(username);
  }

//       code to register a new user account and storing into a map
  public User register(){
      System.out.println(" Please enter unique username ");
      System.out.println("Note : username must be unique");
      String username=sc.next();
        if(checkUser(username)){
            System.out.println("Oops! It seems like username has been already taken");
            return null;
        }else {
            System.out.println("please enter password");
            System.out.println("password must contains one " +
                    "uppercase one lower case and one number");
            String password=sc.next();
            while(!isValidPassword(password)){
                System.out.println(" Wrong Password, password must contains one " +
                        "uppercase one lower case and one number");
                System.out.println("please enter correct password");
                password=sc.next();
            }

            users.put(username,new User(username,password) );
            System.out.println("Register Successful ! ");
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println("now login in ");
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
          return login();
        }
  }

  private boolean isValidPassword(String password){
     String passwordPattern="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d).{8,}$";
      Pattern pattern=Pattern.compile(passwordPattern);
      Matcher matcher = pattern.matcher(password);
      boolean isValid=matcher.matches();
      return isValid;
  }

//      to login existing user
  public User login(){
      System.out.println("Enter your username");
      String username = sc.next();
      System.out.println("Enter your password");
      String password=sc.next();
      User matchedUser=users.get(username);
      System.out.print("logging in");
      try{
          for(int i=0;i<=8;i++){
              System.out.print(".");
              Thread.sleep(300);
          }
      }catch (InterruptedException e){
          System.out.println(e.getMessage());
      }
      if(matchedUser==null){
          System.out.println("Invalid credentials ,TRY AGAIN !");
          return null;
      }else{
          if(matchedUser.getPassword().equals(password)){
              System.out.println("logged in successfully");
              return matchedUser;
          }else {
              System.out.println("Invalid credentials ,TRY AGAIN !");
              return null;
          }
      }
  }

//  code to change user password

  public void changePassword(User user){
      if(user ==null){
          System.out.println("SORRY!! Please enter correct username & password");
      }
      else{
          System.out.println("Enter New Password , Remember don't provide " +
                  "previous Password ");
          String oldPassword= user.getPassword();
          String newPassword= sc.next();
          if(oldPassword.equals(newPassword)){
              System.out.println("sorry you provided previous password try again ! ");
            changePassword(user);
          }else{
              users.put(user.getUsername(),
                      new User(user.getUsername(),newPassword) );
              System.out.println("Yor Password changed successfully");
              System.out.println(users.get(user.getUsername()));
          }
      }
  }

//    code to get all users

  public void getAllUsers(){

      for(Map.Entry<String,User> entry:users.entrySet() ){
          System.out.println(entry.getValue());
      }
  }


//        code to get user by username
  public User getUserByUserName(String userName){
    return users.get(userName);
  }


//  code to delete existing user
  public void deleteAccount(User user){
      System.out.println("please confirm your password once again......");
      System.out.println("Enter your password");
      String password=sc.next();
      if(user.getPassword().equals(password)){
          System.out.println("are you sure to delete your account");
          System.out.println("If yess then press true");
          System.out.println("if no then you know");
          boolean choice=sc.nextBoolean();
          if(choice){
              users.remove(user.getUsername());
              System.out.println("Account deleted Successfully Have a good day ");
              getAllUsers();
          }else{
              System.out.println("Thanks!! Have a good day");
          }
      }else{
          System.out.println("Please enter correct password");
          deleteAccount(user);
      }
  }


}
