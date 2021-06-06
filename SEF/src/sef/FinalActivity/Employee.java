package sef.FinalActivity;

public class Employee extends Person{
    public String jobTitle;
    public String company;
    public int salary;

    //default(empty) constructor
    Employee(){
        this.firstName=null;
        this.age=0;
        this.jobTitle=null;
        this.company=null;
        this.salary=0;
    }
    //paramitized constructor

    public Employee(String name,int theAge, String job,String organization, int theSalary){
        firstName=name;
        age=theAge;
        jobTitle=job;
        company=organization;
        salary=theSalary;
    }

    //setters and getters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //method to convert objects values to string
    public String toString(){
        return this.firstName + " with salary " +this.salary;
    }

    //introduction message for employee object
    public void introMsg(){
        System.out.println("Hello I am " + this.firstName + " " + " and I am " + this.age +" years old!. I work as "+this.jobTitle+" in "+this.company);
    }
    //method for sorting by salaries
    public void sortBySalary(){

    }
    public static void main(String arg[]){
        Employee Jerry = new Employee("Jerry", 21,"Baker","Baked Beans",1337); //since my constructor requires two string parameters we must input both of them
        Jerry.introMsg();

    }
}
