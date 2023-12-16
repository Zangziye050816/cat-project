import java.util.Scanner;
public class Driver {

    private Scanner input = new Scanner(System.in);
    private Shop shop;

    public static void main(String[] args) {
        System.out.println("Cats Project V 1.0");

        Driver driver = new Driver();
        driver.setup();
        driver.runMenu();
    }

    ///////////////////////////////////////////////////////
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
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            option = mainMenu();
        }

        //the user chose option 0, so exit the program
        System.out.println("Exiting...bye bye");
        System.exit(0);
    }

    private void findACAT() {
        input.nextLine();
        System.out.print("Please Enter a Cat Name to Find : ");
        String catName = input.nextLine();

        Cat foundCat = shop.find(catName);

        if (foundCat != null) {
            System.out.println("The found Thing is:  " + foundCat);
        }
        else{
            System.out.println("There are no Things with the name [" + catName + "] in the Shop.");
        }
    }


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

        Cat temp = new Cat(catName , catSex ,catAge, catCharacteristic);
        boolean isAdded = shop.add(temp);
        if (isAdded){
            System.out.println("Cat Added Successfully");
        }
        else{
            System.out.println("No cats Added");
        }
    }

    private void printAllCats() {
        System.out.println("List of Cats are:");
        System.out.println(shop.list());
    }

    private void setup(){
        //find out from the user how many products they would like to order
        System.out.print("How many cats would you like to have in your Store?  ");
        int numberCats = input.nextInt();
        shop = new Shop(numberCats);
    }
    private void deleteCats(){
        input.nextLine();
        System.out.println("which cat you want to delete:");
        String catName= input.nextLine();
        Cat foundCat = shop.find(catName);

        shop.deleteCats(catName);

    }

    private void updateCats(){
        input.nextLine();
        System.out.println("which cat you want to update:");
        String catName= input.nextLine();
        shop.updateCats(catName);
    }

///////////////////////////////////////////////////////

