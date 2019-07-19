package Assignment;
import java.util.Scanner;

public class VolumeCylinder {
    static void volume(int constant, int radius, int height){
        int results = constant * radius * radius * height;
        System.out.println("The volume is " + results);
    }
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("I want to calculate the volume of a cylinder");
        System.out.println("Enter constant");
        int constant = getInput.nextInt();
        System.out.println("Enter radius");
        int radius = getInput.nextInt();


        System.out.println("Enter height");
        int height = getInput.nextInt();
        volume(constant,radius,height);


    }
}
