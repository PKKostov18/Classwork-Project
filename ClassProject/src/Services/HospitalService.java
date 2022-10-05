package Services;

import Modules.Hospital;
import Repositories.HospitalRepository;

public class HospitalService {

    private static HospitalService instance = null;
    private final HospitalRepository hospitalRepository;

    private HospitalService() {
        this.hospitalRepository = HospitalRepository.getInstance();
    }

    public static HospitalService getInstance() {

        if (HospitalService.instance == null) {
            HospitalService.instance = new HospitalService();
        }

        return HospitalService.instance;
    }

    public void insertHospitalInfo() {
        System.out.println("Insert hospital info");
    }

    public void viewHospitalInfo() {
        System.out.println("View hospital info");
    }
}
