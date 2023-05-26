package homeowork_week_6;
import java.util.Scanner;

/**
 * Write a program to inser any temprature value in degree Fahrenheit
 * and convert to degree Celsius ((F - 32) * 5/9 = 0°C
 */
public class Programme_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the temperature in fehrenheit : ");
        float temp = scanner.nextFloat();
        //Object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
                //closing the scanner object
        scanner.close();
    }
    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fehrenheit is equal to " + c + " degree celsius");
    }
}
