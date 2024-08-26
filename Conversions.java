import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Hanbei Bao
 * @version 8/23/2022
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Centimeters to Inches");
        System.out.println("8: Inches to Centimeters");
        System.out.println("9: Miles to Feet");
        System.out.println("10: Feet to Miles");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2)
        {
            System.out.println("Enter Fahrenheight: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celsius = fahrenheit * (5.0/9.0) - 32;
            System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
        }
        if (selection == 3)
        {
            System.out.println("Enter feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet / 3.28;
            System.out.println(feet + "feet is " + meters + " meters");
        }
        if (selection == 4)
        {
            System.out.println("Enter meters: ");
            double meters = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters * 3.28;
            System.out.println(meters + "meters is " + feet + " feet");
        }
        if (selection == 5)
        {
            System.out.println("Enter ounces: ");
            double ounces = keyboard.nextDouble();
            keyboard.nextLine();
            double millileters = ounces / 0.338;
            System.out.println(ounces + "ounces is " + millileters + " millileters");
        }
        if (selection == 6)
        {
            System.out.println("Enter milliliters: ");
            double milliliters = keyboard.nextDouble();
            keyboard.nextLine();
            double ounces = milliliters * 0.338;
            System.out.println(milliliters + "milliliters is " + ounces + " ounces");
        }
        if (selection == 7)
        {
            System.out.println("Enter centimeters: ");
            double centimeters = keyboard.nextDouble();
            keyboard.nextLine();
            double inches = centimeters / 2.54;
            System.out.println(centimeters + "centimeters is " + inches + " inches");
        }
        if (selection == 8)
        {
            System.out.println("Enter inches: ");
            double inches = keyboard.nextDouble();
            keyboard.nextLine();
            double centimeters = inches * 2.54;
            System.out.println(inches + "inches is " + centimeters + " centimeters");
        }
        if (selection == 9)
        {
            System.out.println("Enter miles: ");
            double miles = keyboard.nextDouble();
            keyboard.nextLine();
            double feet = miles * 5280;
            System.out.println(miles + "miles is " + feet + " feet");
        }
        if (selection == 10)
        {
            System.out.println("Enter feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double miles = feet / 5280;
            System.out.println(feet + "feet is " + miles + " miles");
        }
    }
}