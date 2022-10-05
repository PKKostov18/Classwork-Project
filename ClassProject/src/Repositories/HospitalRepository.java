package Repositories;

import Modules.Hospital;

public class HospitalRepository {

    private static HospitalRepository instance = null;

    public static HospitalRepository getInstance() {

        if (HospitalRepository.instance == null) {
            HospitalRepository.instance = new HospitalRepository();
        }

        return HospitalRepository.instance;
    }
}
