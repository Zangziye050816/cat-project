public class Cat {

    private String name;
    private String sex;
    private double age;
    private String characteristic;

    public Cat() {
        this.name = "a Name";
        this.sex = "a sex";
        this.age=99.99;
        this.characteristic="a Characteristic";
    }

    public Cat(String name, String sex, double age,String characteristic) {
        this.name = name;
        this.sex = sex;
        this.age=age;
        this.characteristic=characteristic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setCharacteristic(String sex)
    {
        this.characteristic = characteristic;
    }
    public String getCharacteristic() {
        return characteristic;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public double getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sex=" +sex +",age="+age+",characteristic"+characteristic+
                '}';
    }
}
