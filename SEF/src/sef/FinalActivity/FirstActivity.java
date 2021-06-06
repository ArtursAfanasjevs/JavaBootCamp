package sef.FinalActivity;


import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class FirstActivity implements Comparator<Employee> {
    // Used for sorting in descending order of salary
    public int compare(Employee a, Employee b){
        return b.salary - a.salary;
    }
    static int i=1;
    public static void main(String[] args) {
        //creating list with object employee
        List<Employee> list = new ArrayList<Employee>();
        Employee employee1 = new Employee("Janis",21,"Mailman","postaloffice",1338);
        Employee employee2 = new Employee("Ilze",34,"Tester","accenture",1337);
        Employee employee3 = new Employee("Toms",27,"Programmer","google",2288);
        Employee employee4 = new Employee("Darja",24,"Analyst","swedbank",4900);
        Employee employee5 = new Employee("Ivans",27,"Driver","bolt",5000);
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        list.add(employee4);
        list.add(employee5);
        //printing out numbered unsorted list
        System.out.println("Unsorted List:");
        for( Employee val : list){
            System.out.println(i++ +"."+val);
        }
        //using collections and sort from collections and comparator packages to perform sorting
        Collections.sort(list,new FirstActivity());
        System.out.println();
        System.out.println("Sorted by salary List: ");
        int i=1;
        //printing out numbered sorted list
        for (Employee val : list){
            System.out.println(i++ + ". "+val);
        }
    }
}
