public class Cat {

    private String name;
    private String sex;
    private double age;
    private String characteristic;
    private String appearance;

    public Cat() {
        this.name = "a Name";
        this.sex = "a Sex";
        this.age=99.99;
        this.characteristic="a Characteristic";
        this.appearance = "a Appearance";
    }

    public Cat(String name, String sex, double age,String characteristic,String appearance) {
        this.name = name;
        this.sex = sex;
        this.age=age;
        this.characteristic=characteristic;
        this.appearance=appearance;
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }

    public void setAge(double age) {
        this.age = age;
    }
    public double getAge() {
        return age;
    }

    public void setCharacteristic(String characteristic)
    {
        this.characteristic = characteristic;
    }
    public String getCharacteristic() {
        return characteristic;
    }

    public void setappearance(String appearance)
    {
        this.appearance = appearance;
    }
    public String getappearance() {
        return appearance;
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex=" +sex +",age="+age+",characteristic"+characteristic+",appearance"+appearance+
                '}';
    }

}
