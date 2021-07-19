import java.util.Scanner;

public class MethodsAndClasses {

    public static void Main(String[] args){

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        double minutes = Input.nextDouble();

        long years;
        int days;
        double a = 60*24*365;
        long b=60*24;

        years = (long) (minutes/a);

        minutes = minutes - (years*a);
         days= (int) (minutes/b);
        System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days");
    }

}
