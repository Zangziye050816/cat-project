import java.util.Scanner;

public class Shop {
    private Cat[] cats;
    private int total = 0;

    public Shop(int numberCats) {
        cats = new Cat[numberCats];
    }

    private boolean isFull() {
        return total == cats.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }

    public boolean add(Cat acat) {
        if (isFull()) {
            return false;
        } else {
            cats[total] = acat;
            total++;
            return true;
        }
    }

    public String list() {
        if (isEmpty()) {
            return "No cats in the store";
        } else {
            String listOfCats = "";
            for (int i = 0; i < total; i++) {
                listOfCats += i + ": " + cats[i] + "\n";
            }
            return listOfCats;
        }
    }

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

    public void deleteCats(String name){
        Cat[] newCats = new Cat[cats.length - 1];
        int index = 0;
        for(int i = 0; i<total; i++){
            if (cats[i].getName().equals(name)){
                index = i;
                break;
            }
        }
        System.arraycopy(cats, 0, newCats, 0, index);
        System.arraycopy(cats, index + 1, newCats, index, cats.length - index - 1);
        cats = newCats;
        total = cats.length;

    }

    public void updateCats(String name){
        Cat cat = null;
        for(int i = 0; i<total; i++){
            if (cats[i].getName().equals(name)){
                cat = cats[i];
                break;
            }
        }
        if(cat != null){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Cat Name:  ");
            String catName = input.nextLine();
            System.out.print("Enter the age:  ");
            double catAge = input.nextDouble();
            input.nextLine();
            System.out.print("Enter the Sex:  ");
            String catSex = input.nextLine();
            System.out.print("Enter the Characteristic:  ");
            String catChar = input.nextLine();

            cat.setName(catName);
            cat.setAge(catAge);
            cat.setSex(catSex);
            cat.setCharacteristic(catChar);
        }else{
            System.out.println("no cat");
        }
    }
}


