package backend.lesson05;

import java.util.Scanner;

public class Task2App {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12 : ");
        int number = scanner.nextInt();
        String monthName = "";
        String season = "";
        //proses
        switch (number) {
            case 1:
                monthName = "January";
                season = "Winter";
            break;
            case 2:
                monthName = "February";
                season = "Winter";
                break;
            case 3:
                monthName = "March";
                season = "Spring";
                break;
            case 4:
                monthName = "April";
                season = "Spring";
                break;
            case 5:
                monthName = "May";
                season = "Spring";
                break;
            case 6:
                monthName = "June";
                season="Summer";
                break;
            case 7:
                monthName = "July";
                season="Summer";
                break;
            case 8:
                monthName = "August";
                season="Summer";
                break;
            case 9:
                monthName = "September";
                season="Autumn";
                break;
            case 10:
                monthName = "October";
                season="Autumn";
                break;
            case 11:
                monthName = "November";
                season="Autumn";
                break;
            case 12:
                monthName = "December";
                season = "Winter";
                break;
            default:
                monthName = "Unknown";
                season = "Unknown";
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                break;
        }

        // Output
        if (monthName!="Unknown") {
            System.out.println("Month: " + monthName + "\nSeason: " + season);
        }
    }
}

