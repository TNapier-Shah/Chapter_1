package Person;

public class Person {
    // intializes the variables

    private Name name;
    private int age;
    private String eyeColor;

    public Person(Name name, int age, String eyeC){
        this.name = name;
        this.age = age;
        this.eyeColor = eyeC;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void talk(){
        System.out.print("Welcome, coders! I am ");
    }

    @Override
    public String toString(){
        return name + ". I am " + age + " years old.";
    }

}
