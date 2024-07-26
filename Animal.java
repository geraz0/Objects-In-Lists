import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the isDog
    public boolean isDog() {
        return isDog;
    }

    // Overridden toString method to print details about the animal
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }

    // Main method to handle user input and manage Animal objects
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Animal Menu\nEntering nothing will stop the loop");

        while (true) {
            System.out.println("Please enter a name:");
            String name = scanner.nextLine();

            // Exit the loop if the name input is empty
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Is it a dog? Yes or no:");
            String input = scanner.nextLine();
            boolean isDog = input.equalsIgnoreCase("yes");

            // Create a new Animal object and add it to the list
            animals.add(new Animal(name, isDog));
        }

        // Print all the animal details
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        scanner.close();
    }
}
