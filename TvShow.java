import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private String name;
    private int episodes;
    private String genre;

    // Constructor
    public TvShow(String name, int episodes, String genre) {
        this.name = name;
        this.episodes = episodes;
        this.genre = genre;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the number of episodes
    public int getEpisodes() {
        return episodes;
    }

    // Getter for the genre
    public String getGenre() {
        return genre;
    }

    // Overridden toString method to print TV show details
    @Override
    public String toString() {
        return "The name of the show is " + name + " with " + episodes + " number of episodes. The genre is " + genre;
    }

    // Main method to run the program
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name of the show:");
            String name = scanner.nextLine();

            // Stop the loop if the input is empty
            if (name.isEmpty()) {
                break;
            }

            System.out.println("How many episodes?");
            int episodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre?");
            String genre = scanner.nextLine();

            // Add new TvShow object to the list
            tvShows.add(new TvShow(name, episodes, genre));
        }

        // Print all TV shows in the list
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        scanner.close();
    }
}
