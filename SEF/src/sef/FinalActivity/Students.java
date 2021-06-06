package sef.FinalActivity;

class Stundets extends Person{
    String school;


    //setters and getters
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
    //intro message for Students obj
    public void introMsg(){
        System.out.println("I am studying in " + this.school);
    }

    public static void main(String[] args) {
        Stundets Poll = new Stundets();
        Poll.setSchool("Rigas Technical University");
        Poll.introMsg();
    }
}