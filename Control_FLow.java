package week1_cj4_cipherschool;
import java.util.Scanner;

class student{
    String name;
    int marks;
    boolean checkpass() {
        if(marks>=40){
            return true;

        }
        else {
            return false;

        }
    }
}

class control_FLow {

    int findMax(int a, int b, int c) {
        if(a>b){
            if(a>c){
                return a;
            }
            else {
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else {
                return c;

            }
        }


    }


    public static void main(String[] args) {
        student s1=new student();
        s1.name = "Dhruv";
        s1.marks = 98;

        student s2 =new student();
        s2.name = "niha";
        s2.marks = 36;


        System.out.println(s1.checkpass());
        System.out.println(s2.checkpass());

        control_FLow  cf=new control_FLow();



        System.out.println(cf.findMax(10, 7, 15));


        Scanner sc = new Scanner(System.in);
        char c ='d';
        switch(c){
            case 'a':
                System.out.println("hi, i am A");
                break;
            case 'b':
                System.out.println("hi, i am B");
                break;
            case 'c':
                System.out.println("hi, i am C");
                break;
            default:
                System.out.print("i am not A, B, C");

        }

    }

}