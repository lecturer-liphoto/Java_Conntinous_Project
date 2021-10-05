public class Test {

    public static void main(String[] args) {

        /*
        *To test the below code, comment the section you are NOT are interested in.
        *Example, if you are interested how the code works for student2, comment all sections that have nothing to do with student2
        */
        Person person1 = new Person(); //no argument constructor used in Person.
        person1.print(); //will print with null values as Person1 was created without and details
        
        //below we create a new person but now with details
        Person person2 = new Person("Tumisang",  "Liphoto", 30, 'M'); //take care of the order of variables vis-a-vis constructor
        person2.print();
        Student student1 = new Student();//no argument constructor used in Student.
        student1.print();//will print with null values as student1 was created without and details
        
        //below we create a new Student but now with details, take care of the ABSENCE of name, surname, age and gender; find the constructor being used
        Student student2 = new Student("901002470", "Mr. Nkhatho", "BSSM Y1S1");//take care of the order of variables vis-a-vis constructor
        student2.print();//take care that name, surname, age and gender are given as null by the print methods, these are not given in the above constructor

        //below we create a new Student but now with details, take care of the PRESENCE of name, surname, age and gender; find the constructor being used
        Student student3 = new Student("Tumisang", "Liphoto", 30, 'M', "901002470", "Mr. Nkhatho", "BSSM Y1S1");
        student3.print();//will print the detail of student3, realise that the student now has the details that make them a person who is a student
        
        Lecturer lecturer1 = new Lecturer( "Lecturer_Name", "Lecturer_Surname", 35, 'M', "LUCT 355", "BIJP 123");
        lecturer1.print();
        /*
        * This code will execute the method coolPrint with is overloaded based on calling object
        */
        person1.coolPrint( "testString");//Be aware of the behaviour of this function when called with a person object
        student1.coolPrint(12);//Be aware of the behaviour of this function when called with a person object
        lecturer1.coolPrint(true);
        
        
    }
}
