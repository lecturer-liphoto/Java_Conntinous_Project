public class Person {

    private String name; //name of person
    private String surname; //surname of person
    private int age;//age of person
    private char gender;//gender of person

    /*
        The constructor is a special methods that will be called each time an object of the class is instantiated
        The constructor differs from other methods in that
            1. It MUST have the same name as that of the class it is in; take care those in this class person are both called Person
            2. It will have not return type; take care of the absence of a return type
     */

    public Person() {
        System.out.println("Person created using the no argument constructor.");
        //This constructor will be called when ever the below line is reached
            //Person person = new Person();
        //No argument constructor for class person
    }

    public Person(String name, String surname, int age, char gender) {
        System.out.println("Person created using the parameterized constructor.");
        //Parameterized constructor for class person
        //This time the person is being assigned the details the needed
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        this.setSurname(surname);
    }

    //setter and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public  void print(){
        //This function will print the details of the person
        System.out.println("The name of the " + this.getClass().getSimpleName() + "  is  " + this.getName() +".");
        //The this.getClass().getSimpleName() is used to get the type of object, the type that called the method
        System.out.println("The surname of the " + this.getClass().getSimpleName() + "  is  " + this.getSurname() +".");
        System.out.println("The age of the " + this.getClass().getSimpleName() + "  is  " + this.getAge() +".");
        System.out.println("The gender of the " + this.getClass().getSimpleName() + "  is  " + this.getGender() +".");
        System.out.println();
    }

    public void coolPrint(String testString){
        //Pay careful attention to what functions these methods performs
        System.out.println(testString);
        System.out.println("Realise that the method is printing the name of the object.");
    }
}//end class person
