public class Cat {

    private String name;// The name of the cat
    private String sex; // The sex of the cat
    private double age;// The age of the cat
    private String characteristic; // The characteristic of the cat
    private String appearance;// The appearance of the cat

    public Cat() {
        this.name = "a Name";// Default name for the cat
        this.sex = "a Sex";// Default sex for the cat
        this.age=99.99;// Default age for the cat
        this.characteristic="a Characteristic"; // Default characteristic for the cat
        this.appearance = "a Appearance";// Default appearance for the cat
    }

    public Cat(String name, String sex, double age,String characteristic,String appearance) {
        this.name = name;// Set the name of the cat
        this.sex = sex; // Set the sex of the cat
        this.age=age;// Set the age of the cat
        this.characteristic=characteristic;// Set the characteristic of the cat
        this.appearance=appearance;// Set the appearance of the cat
    }


    public void setName(String name) {
        this.name = name;// Set the name of the cat
    }
    public String getName() {
        return name; // Get the name of the cat
    }

    public void setSex(String sex) {
        this.sex = sex;// Set the sex of the cat
    }
    public String getSex() {
        return sex;// Get the sex of the cat
    }

    public void setAge(double age) {
        this.age = age; // Set the age of the cat
    }
    public double getAge() {
        return age;// Get the age of the cat
    }

    public void setCharacteristic(String characteristic)
    {
        this.characteristic = characteristic;// Set the characteristic of the cat
    }
    public String getCharacteristic() {
        return characteristic;// Get the characteristic of the cat
    }

    public void setappearance(String appearance)
    {
        this.appearance = appearance;// Set the appearance of the cat
    }
    public String getappearance() {
        return appearance;// Get the appearance of the cat
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex=" +sex +",age="+age+",characteristic"+characteristic+",appearance"+appearance+
                '}';
    }

}
