package week1_cj4_cipherschool;

class car{
    String name;
    String color;
    int year;
    int max_Speed;
    void acceleration() {
        System.out.println("Car is accelerating...!");
    }


}

public class Car_Study {
    public static void main(String[]args){
        car polo = new car();
        System.out.println(polo.name);
        System.out.println(polo.year);
        System.out.println(polo.year);
        System.out.println(polo.max_Speed);

        polo.name = "polo";
        polo.color = "Red";
        polo.year = 2016;
        polo.max_Speed = 120;



        System.out.println(polo.name);
        System.out.println(polo.year);
        System.out.println(polo.year);
        System.out.println(polo.max_Speed);
    }
}