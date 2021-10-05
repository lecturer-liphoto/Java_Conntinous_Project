public class Lecturer extends Person{
    private String staffNumber;
    private String programCode;//The code for the program taught by the lecturer

    /*
    *Realise the similarities between class Lecturer and Student
    */
    public Lecturer(){
    }

    public Lecturer(String staffNumber, String programCode) {
        this.staffNumber = staffNumber;
        this.programCode = programCode;
    }

    public Lecturer(String name, String surname, int age, char gender, String staffNumber, String programCode) {
        super(name, surname, age, gender);
        this.setStaffNumber(staffNumber);
        this.setProgramCode(programCode);
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("The staff number of the " + this.getClass().getSimpleName() + "  is  " + this.getStaffNumber() +".");
        System.out.println("The course taught by the  " + this.getClass().getSimpleName() + "  is  " + this.getProgramCode() +".");
        System.out.println();
    }

    public void coolPrint(boolean testBoolean){
        System.out.println(testBoolean);
        System.out.println("Realise that the method is now doing something different because it is called using a "+ this.getClass().getSimpleName()+ " object.");

    }
}
