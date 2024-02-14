package Person;

public class Name {

    //Creates a full name for the Person
    private String firstName;
    private String middleI;
    private String lastName;

    public Name(String firstName, String middleI, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleI = middleI;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleI() {
        return middleI;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleI(String middleI) {
        this.middleI = middleI;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString(){
        return firstName + " " + middleI + " " + lastName;
    }
}
