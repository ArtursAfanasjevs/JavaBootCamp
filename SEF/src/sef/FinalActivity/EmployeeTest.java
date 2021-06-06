package sef.FinalActivity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    private Employee employee;

    protected void setUp() throws Exception {
        employee = new Employee();
    }
    @Test
    void testSetAndGetFirstName() {
        String testFirstName = "Lora";
        assertNull(employee.getFirstName());
        employee.setFirstName(testFirstName);
        assertEquals(testFirstName, employee.getFirstName());
    }
    @Test
    void testSetAndGetAge() {
        int testAge = 55;
        assertEquals(0, 0, 0);
        employee.setAge(testAge);
        assertEquals(testAge, employee.getAge(), 0);
    }
    @Test
    void testSetAndGetJobTitle() {
        String testJobTitle = "player";
        assertNull(employee.getJobTitle());
        employee.setJobTitle(testJobTitle);
        assertEquals(testJobTitle, employee.getJobTitle());
    }
    @Test
    void testSetAndGetCompany() {
        String testCompany = "Tesla";
        assertNull(employee.getCompany());
        employee.setCompany(testCompany);
        assertEquals(testCompany, employee.getCompany());
    }
    @Test
    void testSetAndGetSalary() {
        int testSalary = 1337;
        assertEquals(0, 0, 0);
        employee.setAge(testSalary);
        assertEquals(testSalary, employee.getSalary(), 0);
    }
    @Test
    void introMsg() {

        String testName = "Derek";
        int age= 27;
        String testWelcome="My name is " + testName +  " and I am " + age +" years old!";
        assertEquals("My name is Derek and I am 27 years old!",testWelcome);

    }

    @Test
    void jobDesc() {
        String testCompany = "Tired Company";
        String jobTitle = "Pleasehelpme";
        String testDesc ="I work in " + testCompany + " as " + jobTitle;
        assertEquals("I work in Tired Company as Pleasehelpme",testDesc);
    }
}