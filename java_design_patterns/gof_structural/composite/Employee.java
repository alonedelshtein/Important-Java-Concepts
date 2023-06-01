package java_design_patterns.gof_structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }
    
    public int getSal(String name){        
        if(name != this.name)
            return -1;
        return this.salary;
    }

    public List<Employee> getSubordinates(String name, int sal){
        if(name != this.name)
            return new ArrayList<Employee>();
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
