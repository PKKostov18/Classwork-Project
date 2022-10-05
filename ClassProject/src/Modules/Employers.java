package Modules;

public class Employers extends Hospital {

    protected Hospital hospital;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected double salary;

    public Employers(String name, String location, int capacity, Hospital hospital, String firstName, String lastName, String email, String phoneNumber, double salary) {
        super(name, location, capacity);
        this.hospital = hospital;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee information: " + '\'' +
                " hospital: " + hospital + '\'' +
                " firstName: " + firstName + '\'' +
                " lastName: " + lastName + '\'' +
                " email: " + email + '\'' +
                " phoneNumber: " + phoneNumber + '\'' +
                " salary: " + salary +
                " name: " + name + '\'' +
                " location: " + location + '\'' +
                " capacity: " + capacity;
    }
}
