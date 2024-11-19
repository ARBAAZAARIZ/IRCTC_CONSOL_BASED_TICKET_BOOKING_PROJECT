package main;



import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

class Trainssss{
    private int num;
    private String number;

    public Trainssss(int num, String number) {
        this.num = num;
        this.number = number;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String toString(){
        return "num : "+ num + "  number"+number;
    }
}

public class waste {

      static  Map<Integer,Trainssss> TrainssssMapData=new HashMap<>();

    public static void main(String[] args) {

        TrainssssMapData.put(123, new Trainssss(123,"12101"));
        TrainssssMapData.put(234, new Trainssss(234,"23908"));
        TrainssssMapData.put(789, new Trainssss(789,"22233"));
        TrainssssMapData.put(456, new Trainssss(456,"77881"));

        System.out.println(TrainssssMapData.put(786, new Trainssss(786,"66778")));

    }

}
