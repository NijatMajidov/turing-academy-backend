package backend.Lab01;

import java.util.Scanner;

public class MovieApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean proses = true;
        String choice;
        Movie[] movies = new Movie[0];
        int count = 0;

        while (proses) {
            System.out.println("\nMenu:" +
                    "\n1. Input movies" +
                    "\n2. Display movies and ratings" +
                    "\n3. How many movies to add" +
                    "\n4. Calculate and display" +
                    "\n5. Search for a movie" +
                    "\n6. Update rating " +
                    "\n7. Delete movie" +
                    "\n8. Sort movies" +
                    "\n0. Exit");
            System.out.print("Enter the choice: ");
            choice = scan.next();
            scan.nextLine();

            switch (choice) {
                case "1":
                    movies = addMovie(scan, movies,3,count);
                    count+=3;
                    break;
                case "2":
                    displayMovies(movies);
                    break;
                case "3":
                    System.out.println("How many movies to add? ");
                    int n = scan.nextInt();
                    scan.nextLine();
                    movies = addMovie(scan,movies,n,count);
                    count+=n;
                    break;
                case "4":
                    System.out.printf("The average rating of all movies: %5.2f\n", numericalAverage(movies));

                    System.out.println("Movies with the maximum rating:");
                    displayMovies(maxRating(movies));

                    System.out.println("Movies with the minimum rating:");
                    displayMovies(minRating(movies));
                    break;
                case "5":
                    System.out.print("Enter the search movie name: ");
                    String name = scan.nextLine();
                    Movie[] foundMovies = searchMovie(name, movies);
                    if (foundMovies.length > 0) {
                        System.out.println("Found Movies:");
                        displayMovies(foundMovies);
                    }
                    break;
                case "6":
                    updateRating(scan,movies);
                    break;
                case "7":
                    movies=deleteMovie(scan,movies);
                    break;
                case "8":
                    sortMovie(movies);
                    break;
                case "0":
                    proses = false;
                    break;
                default:
                    System.out.println("If it is a different choice, it is wrong ");
            }
        }
    }

    public static Movie[] addMovie(Scanner scan, Movie[] movies, int n, int count) {
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name: ");
            String name = scan.nextLine();

            boolean isValid = false;
            double rating =0.0;
            while (!isValid) {
                System.out.print("Enter the rating: ");
                if (scan.hasNextDouble()) {
                    rating = scan.nextDouble();
                    scan.nextLine();
                    isValid = true;
                } else {
                    System.out.println("You have entered an incorrect value. Please try again!");
                    scan.next();
                }
            }
            Movie movie = new Movie(name, rating);

            if (count == movies.length) {
                Movie[] newMovies = new Movie[movies.length + 1];
                for (int j = 0; j < movies.length; j++) {
                    newMovies[j] = movies[j];
                }
                movies = newMovies;
            }
            movies[count] = movie;
            count++;
        }
        return movies;
    }
    public static void displayMovies(Movie[] movies){
        if(movies.length==0){
            System.out.println("There is no movie!");
        }else{
            for (int i = 0; i < movies.length; i++) {
              System.out.println(movies[i].toString());
            }
        }
    }

    public static double numericalAverage(Movie[] movies){
        double sum = 0;
        for (int i = 0; i<movies.length; i++){
            sum += movies[i].rating;
        }
        return sum/movies.length;
    }

    public static Movie[] maxRating(Movie[] movies){
        if (movies.length == 0) {
            return new Movie[0];
        }
        double maxRating = movies[0].rating;
        for (Movie movie : movies) {
            if (movie.rating > maxRating) {
                maxRating = movie.rating;
            }
        }
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating == maxRating) {
                count++;
            }
        }
        Movie[] maxRatedMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating == maxRating) {
                maxRatedMovies[index++] = movie;
            }
        }
        return maxRatedMovies;
    }

    public static Movie[] minRating(Movie[] movies){
        if (movies.length == 0) {
            return new Movie[0];
        }
        double minRating = movies[0].rating;
        for (Movie movie : movies) {
            if (movie.rating < minRating) {
                minRating = movie.rating;
            }
        }
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating == minRating) {
                count++;
            }
        }
        Movie[] minRatedMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating == minRating) {
                minRatedMovies[index++] = movie;
            }
        }
        return minRatedMovies;
    }

    public static Movie[] searchMovie(String name, Movie[] movies){
        int count = 0;
        for (Movie movie : movies) {
            if (name.equalsIgnoreCase(movie.name)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No movies found with the name \"" + name + "\".");
            return new Movie[0];
        }
        Movie[] foundMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (name.equalsIgnoreCase(movie.name)) {
                foundMovies[index++] = movie;
            }
        }
        return foundMovies;
    }

    public static void updateRating(Scanner scan, Movie[] movies){
        if (movies.length == 0) {
            System.out.println("Movie not found!");
            return;
        }
        System.out.print("Enter the search movie name: ");
        String name = scan.nextLine();
        Movie[] movie=  searchMovie(name,movies);
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter the new rating: ");
            if (scan.hasNextDouble()) {
                movie[0].rating = scan.nextDouble();
                scan.nextLine();
                isValid = true;
            } else {
                System.out.println("You have entered an incorrect value. Please try again!");
                scan.next();
            }
        }
    }

    public static Movie[] deleteMovie(Scanner scan, Movie[] movies){
        if (movies.length == 0) {
            System.out.println("Movie not found!");
            return new Movie[0];
        }
        System.out.print("Enter the search movie name: ");
        String name = scan.nextLine();
        int count = 0;

        for (Movie movie : movies) {
            if (!movie.name.equalsIgnoreCase(name)) {
                count++;
            }
        }
        if (count == movies.length) {
            System.out.println("No movies found with the name \"" + name + "\".");
            return movies;
        }
        Movie[] newMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (!movie.name.equalsIgnoreCase(name)) {
                newMovies[index++] = movie;
            }
        }
        return newMovies;
    }

    public static void sortMovie(Movie[] orjinalMovies){
        if (orjinalMovies.length == 0) {
            System.out.println("Movie not found!");
            return;
        }
        Movie[] movies = new Movie[orjinalMovies.length];
        for (int i = 0; i < movies.length; i++) {
            movies[i] = new Movie(orjinalMovies[i].name, orjinalMovies[i].rating);
        }
        for(int i=0; i<movies.length-1;i++){
            int minIndex = i;
            for(int j=i+1; j<movies.length;j++){
                if(movies[j].rating>movies[minIndex].rating){
                    minIndex=j;
                }
            }
            Movie temp = movies[i];
            movies[i]= movies[minIndex];
            movies[minIndex] = temp;
        }
        displayMovies(movies);
    }
}