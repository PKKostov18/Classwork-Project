package Controllers;

import java.util.Scanner;

import Services.HospitalService;
import Services.EmployeeService;

public class MainController {

    private final HospitalService hospitalService;
    private final EmployeeService employeeService;

    public MainController() {
        this.hospitalService = HospitalService.getInstance();
        this.employeeService = EmployeeService.getInstance();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose option: ");
        System.out.println("1. Enter hospital info");
        System.out.println("2. Enter employee info");
        System.out.println("3. View all hospitals");
        System.out.println("4. View all employees");
        System.out.println("4. Exit");
        int option = scanner.nextInt();

        switch (option) {
            case 1: hospitalService.insertHospitalInfo();
                break;
            case 2: employeeService.insertEmployeeInfo();
                break;
            case 3: hospitalService.viewHospitalInfo();
                break;
            case 4: employeeService.viewEmployeeInfo();
                break;
            default:
                break;
        }
    }
}
