import java.util.Scanner;
// Declares a private array of Cat objects called "cats"
public class Shop {
    private Cat[] cats;
// Declares a private integer variable called "total" and initializes it to 0
    private int total = 0;
// Constructor that takes an integer argument "numberCats"
    public Shop(int numberCats) {
        cats = new Cat[numberCats];
    }
// Private method that checks if the array is full
    private boolean isFull() {
         // Returns true if "total" is equal to the length of the "cats" array
    }
        return total == cats.length;
    }
// Private method that checks if the array is empty
    private boolean isEmpty() {
        // Returns true if "total" is equal to 0
        return total == 0;
    }
// Public method that takes a Cat object as an argument and adds it to the array
    public boolean add(Cat acat) {
        if (isFull()) {
            return false;
        } else {
            cats[total] = acat;// Adds the Cat object to the array at the index "total"
            total++;
            return true;// Returns true to indicate successful addition
        }
    }
// Public method that returns a string representation of the Cat objects in the array
    public String list() {
        if (isEmpty()) {// Checks if the array is empty
            return "No cats in the store";
        } else {
            String listOfCats = "";// Declares an empty string variable called "listOfCats"
            for (int i = 0; i < total; i++) {// Iterates through the array from index 0 to "total"
                listOfCats += i + ": " + cats[i] + "\n";
            }
            return listOfCats;// Returns the string representation of the Cat objects in the array
        }
    }
// Public method that takes a string argument "name" and returns a Cat object with matching name
    public Cat find(String name) {

        Cat foundCat = null;

        if (!isEmpty()) {
            for (int i = 0; i < total; i++)
                if (cats[i].getName().contains(name))
                    foundCat = cats[i];
        } else {
            return null;
        }
        return foundCat;
    }
//The following content refers to the code available on Github

 // Create a new array with length one less than the original array
    public void deleteCats(String name){
        Cat[] newCats = new Cat[cats.length - 1];
        int index = 0;
        for(int i = 0; i<total; i++){
            if (cats[i].getName().equals(name)){
                index = i;
                break;
            }
        }
        System.arraycopy(cats, 0, newCats, 0, index);// Copy the cats before the deleted cat to the new array
        System.arraycopy(cats, index + 1, newCats, index, cats.length - index - 1);// Copy the cats after the deleted cat to the new array
        cats = newCats;// Assign the new array to the original array
        total = cats.length;// Update the total number of cats in the array
}

    }

    public void updateCats(String name){
        Cat cat = null;// Initialize a variable to store the cat to be updated
        for(int i = 0; i<total; i++){// Iterate through the cats array
            if (cats[i].getName().equals(name)){ // Check if the current cat's name matches the given name
                cat = cats[i];
                break;
            }
        }
        if(cat != null){// If the cat to be updated is found
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Cat Name:  ");
            String catName = input.nextLine();// Read the new cat name from the user
            System.out.print("Enter the age:  ");
            double catAge = input.nextDouble(); // Read the new cat age from the user
            input.nextLine();
            System.out.print("Enter the Sex:  ");
            String catSex = input.nextLine(); // Read the new cat sex from the user
            System.out.print("Enter the Characteristic:  ");
            String catChar = input.nextLine();// Read the new cat characteristic from the user
            System.out.print("Enter the Appearance:  ");
            String catAppearance = input.nextLine();// Read the new cat appearance from the user
            

            cat.setName(catName);// Update the cat's name
            cat.setAge(catAge);// Update the cat's age
            cat.setSex(catSex); // Update the cat's sex
            cat.setCharacteristic(catChar); // Update the cat's characteristic
            cat.setAppearance(catAppearance); // Update the cat's appearance
            
        }else{
            System.out.println("no cat"); // If the cat to be updated is not found
        }
    }
}


