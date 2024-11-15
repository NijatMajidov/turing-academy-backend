package backend.finalTasks;

import java.util.Scanner;

public class WeekPlanner {

    public static void main(String[] args) {
        //input
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do homework";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "visit friends; read a book";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to the gym; attend meetings";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "shop groceries; prepare dinner";
        schedule[5][0] = "Friday";
        schedule[5][1] = "watch a movie; relax";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "clean the house; family time";

        Scanner scanner = new Scanner(System.in);
        //proses
        System.out.println("Welcome to the Week Planner!");
        while(true){
            System.out.print("Please, input the day of the week (or 'exit' to quit): ");
            String input = scanner.nextLine().trim().toLowerCase();

            if(input.equals("exit")){
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            if(input.startsWith("change") || input.startsWith("reschedule")){
                String day = input.substring(input.indexOf(" ") + 1).trim();
                boolean dayFound = false;

                for(int i = 0; i < schedule.length; i++){
                    if (schedule[i][0].equalsIgnoreCase(day)){
                        dayFound = true;
                        System.out.print("Please, input new tasks for " + schedule[i][0] + ": ");
                        schedule[i][1] = scanner.nextLine().trim();
                        System.out.println("Tasks for " + schedule[i][0] + " have been updated.");
                        break;
                    }
                }
                if(!dayFound){
                    System.out.println("Sorry, I don't understand '" + day + "'. Please try again.");
                }
                continue;
            }
            boolean validDay = false;
            for(String[] strings : schedule){
                if(strings[0].equalsIgnoreCase(input)){
                    validDay = true;
                    System.out.println("Your tasks for "+ strings[0] +": " + strings[1]);
                    System.out.println("\nEnter 'change [day]' or 'reschedule [day]' if you want to change the schedule)");
                    break;
                }
            }
            if(!validDay){
                System.out.println("Sorry, I don't understand you, please try again.");
            }
        }
    }
}