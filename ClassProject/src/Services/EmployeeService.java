package Services;

import Repositories.EmployeeRepository;
import Repositories.HospitalRepository;

public class EmployeeService {

    private static EmployeeService instance = null;

    private final EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = EmployeeRepository.getInstance();
    }

    public static EmployeeService getInstance() {

        if (EmployeeService.instance == null) {
            EmployeeService.instance = new EmployeeService();
        }

        return EmployeeService.instance;
    }

    public void insertEmployeeInfo() {
        System.out.println("Insert employee info");
    }

    public void viewEmployeeInfo() {
        System.out.println("View employee info");
    }
}
