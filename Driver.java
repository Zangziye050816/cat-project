import java.util.Scanner;
// Driver class is the main class that runs the programe
public class Driver {

    private Scanner input = new Scanner(System.in);// It also has a Scanner object called "input" for user input
    private Shop shop;// It has a Shop object called "shop" to store and manage cat objects

    public static void main(String[] args) {
        System.out.println("Cats Project V 1.0");
// It has a main method that calls the setup and runMenu methods
        Driver driver = new Driver();
        driver.setup();
        driver.runMenu();
    }

    ///////////////////////////////////////////////////////
    // mainMenu method displays a menu of options for the user to choose from
    private int mainMenu(){
        System.out.print("""
               Cats Menu
               ---------
                  1) Add a cat
                  2) List All cats
                  3) Find a cat
                  4) Delete a cat
                  5) Update a cat
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }
    ///////////////////////////////////////////////////////
    // runMenu method runs a loop that displays the main menu, executes the chosen option, and repeats until the user chooses to exit
        int option = mainMenu();
    private void runMenu(){
        int option = mainMenu();

        while (option != 0){

            switch (option){
                case 1 -> addACAT();
                case 2 -> printAllCats();
                case 3 -> findACAT();
                case 4 -> deleteCats();
                case 5 -> updateCats();
                default -> System.out.println("Invalid option entered: " + option);
            }

            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPlease press enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            option = mainMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting...thank you (*>.<*)bye bye");
        System.exit(0);
    }
// findACAT method prompts the user to enter a cat name to search for
    private void findACAT() {
        input.nextLine();
        System.out.print("Please Enter a Cat Name to Find : ");
        String catName = input.nextLine();

        Cat foundCat = shop.find(catName);
// If a cat is found, it prints a message with the found cat's information
        if (foundCat != null) {
            System.out.println("The found thing is:  " + foundCat);
        }
    //else block to handle the case when there are no Things with the given name in the Shop
        else{
            System.out.println("There are no things with the name [" + catName + "] in the Shop.");
        }
    }

// method to add a new Cat to the Shop
    private void addACAT(){
        input.nextLine();//dummy read of String to clear the buffer - bug in Scanner class.

        System.out.print("Enter the Cat Name:  ");
        String catName = input.nextLine();
        System.out.print("Enter the age:  ");
        double catAge = input.nextDouble();
        input.nextLine();
        System.out.print("Enter the Sex:  ");
        String catSex = input.nextLine();
        System.out.print("Enter the Characteristic:  ");
        String catCharacteristic = input.nextLine();
        System.out.print("Enter the Appearance:  ");
        String catAppearance = input.nextLine();

        Cat temp = new Cat(catName , catSex ,catAge, catCharacteristic,catAppearance);
        boolean isAdded = shop.add(temp);
        if (isAdded){
            System.out.println("Cat Added Successfully");
        }
        else{
            System.out.println("No cat Added");
        }
    }
// method to print all the Cats in the Shop
    private void printAllCats() {
        System.out.println("List of Cats are:");
        System.out.println(shop.list());
    }
// method to setup the Shop with the desired number of products
    private void setup(){
        //find out from the user how many products they would like to order
        System.out.print("How many cats would you like to have in your Shop?  ");
        int numberCats = input.nextInt();
        shop = new Shop(numberCats);
    }
    //This method prompts the user to enter the name of the cat they want to delete and uses the deleteCats() method of the Shop class to remove the cat from the shop.
    private void deleteCats(){
        input.nextLine();
        System.out.println("which cat you want to delete:");
        String catName= input.nextLine();
        Cat foundCat = shop.find(catName);

        shop.deleteCats(catName);

    }
//This method prompts the user to enter the name of the cat they want to update and uses the updateCats() method of the Shop class to modify the details of the cat.
    private void updateCats(){
        input.nextLine();
        System.out.println("which cat you want to update:");
        String catName= input.nextLine();
        shop.updateCats(catName);
    }

///////////////////////////////////////////////////////

