public class Student extends  Person{ //Take care of the ***extends Person****
    /*
        Each student is a Person; as such we are going to inherit the properties of class Person into class Student

        Each student will therefore by extension have a name, surname, age and gender.
     */

    //Member variables; these are the attributes specific to a student and may not necessarily be those of a Person
    private String studentNumber;//The student number of the student
    private String lecturer;//One lecturer of this student
    private String programCode;//The code for the program taken by this student

    //constructors
    public Student() {
        System.out.println("No argument constructor for student used");
        //No argument constructor
    }

    public Student(String studentNumber, String lecturer, String programCode) {
        System.out.println("Parameterised constructor for student used");
        //Parameterized constructor for class student
        //This constructor will initialise a student, take care of the absence of the name, surname, age and gender.
        //A student initialised using this constructor will not have the above listed details. See the next constructor.
        this.setStudentNumber(studentNumber);
        this.setLecturer(lecturer);
        this.setProgramCode(programCode);
    }

    public Student(String name, String surname, int age, char gender, String studentNumber, String lecturer, String programCode) {
        //Compare to the above constructor, realise that this one makes usage of name, surname, age and gender, these are the attributes a Student will have derived from Person.
        //As we now need to create a Student who is a Person, we now use super() to create an instance of such student.
        //The call to super() MUST be the first line of code, not line of code can come before this one, uncomment the line above it to test

        //Realise that we are at present we are NOT using the setters but are using the code defined inside the setters, this may not be a good coding practice
        //System.out.println("uncomment this line to see the error");
        super(name, surname, age, gender);
        this.studentNumber = studentNumber;
        this.lecturer = lecturer;
        this.programCode = programCode;
    }

    //setters and getters
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    /*
    * METHOD OVERRIDING
    * This is the process in OOP where a subclass overrides the definition of a method defined in the super class.
    */
    @Override
    public void print(){
        /*
            The print method inherited from Person does not print the details of a student: not every person is a student
            We thus need to OVERRIDE the print method from person to ensure that we are able to print ALL the details of the student.

            Take care that the signatures of the print method defined in Person and that defined in Student are exactly the same hence the added annotation "@Override"

            To reuse code, we use super() to make a call to the print method defined in Person as it can print the details (name, surname, age and gender) of a person, take care
            that a call to super() MUST be the first line of code where it is needed.
         */
        super.print();
        System.out.println("The student number of the " + this.getClass().getSimpleName() + "  is  " + this.getStudentNumber() +".");
        System.out.println("The lecturer of the " + this.getClass().getSimpleName() + "  is  " + this.getLecturer() +".");
        System.out.println("The programCode of the " + this.getClass().getSimpleName() + "  is  " + this.getProgramCode() +".");
        System.out.println();
    }

    public void coolPrint(int testInt){
        System.out.println(testInt);
        System.out.println("Realise that the method is now doing something different because it is called using a "+ this.getClass().getSimpleName()+ " object.");
    }
}//end class Student
