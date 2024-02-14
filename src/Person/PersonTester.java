package Person;

public class PersonTester {
    public static void main(String[] args){
        Person person1 = new Person(new Name("Howard", "","Roark"), 28, "green");
        person1.talk();
        System.out.println(person1);



        Person Taj = new Person(new Name("Taj", "K", "Shah"), 24,"Brown");
        Taj.talk();
        System.out.print(Taj);
    }

}
