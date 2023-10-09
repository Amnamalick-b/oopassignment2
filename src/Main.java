
enum Gender {
    MALE, FEMALE, OTHER
}
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }
}
class Person {
    private String name;
    private int age;
    private Gender gender;
    private Address address;
    private String[] hobbies;

    public Person(String name, int age, Gender gender, Address address, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public String[] getHobbies() {
        return hobbies;
    }
}

public class Main {
    public static void main(String[] args) {

        Address address = new Address("123 Main St", "Cityville", "Stateville", "12345");


        String[] hobbies = {"Reading", "Gardening"};
        Person person = new Person("John Doe", 30, Gender.MALE, address, hobbies);


        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("Address: " + person.getAddress().getStreet() + ", " +
                person.getAddress().getCity() + ", " +
                person.getAddress().getState() + " " +
                person.getAddress().getZipCode());

        System.out.println("Hobbies:");
        for (String hobby : person.getHobbies()) {
            System.out.println("- " + hobby);
        }
    }
}
