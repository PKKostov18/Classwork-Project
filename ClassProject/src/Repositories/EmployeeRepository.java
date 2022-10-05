package Repositories;

public class EmployeeRepository {

    private static EmployeeRepository instance = null;

    public static EmployeeRepository getInstance() {

        if (EmployeeRepository.instance == null) {
            EmployeeRepository.instance = new EmployeeRepository();
        }

        return EmployeeRepository.instance;
    }
}
