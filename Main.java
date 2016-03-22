import java.util.Scanner;
import java.io.*;
class Main {
    public static void main(String args[]) throws java.io.IOException {
        Scanner keyboard = new Scanner(System.in);
        double mph, duration;
        System.out.println("Enter a speed and duration:");
        mph = keyboard.nextDouble();
        duration = keyboard.nextDouble();
        Distance d = new Distance(mph, 0.0);

        PrintWriter outFile = new PrintWriter("report.txt");

        outFile.println("Hour\t\tDistance Traveled");
        for(int i = 1; i <= (int)duration; i++) {
            d.setHoursTraveled((double)i);
            outFile.println( i + "\t\t" + d.getDistance());
        }
        outFile.close();
    }
}