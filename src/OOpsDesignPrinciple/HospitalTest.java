package OOpsDesignPrinciple;

import java.util.*;

class Patient {
    String name;
    Patient(String name) { this.name = name; }
}

class Doctor {
    String name;
    Doctor(String name) { this.name = name; }

    void consult(Patient p) {
        System.out.println("Doctor " + name + " consulting patient " + p.name);
    }
}

class Hospital {
    String hospitalName;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) { this.hospitalName = hospitalName; }

    void addDoctor(Doctor d) { doctors.add(d); }
    void addPatient(Patient p) { patients.add(p); }
}

public class HospitalTest {
    public static void main(String[] args) {
        Hospital h = new Hospital("Apollo");
        Doctor d1 = new Doctor("Dr. Arjun");
        Patient p1 = new Patient("Ravi");

        h.addDoctor(d1);
        h.addPatient(p1);

        d1.consult(p1);
    }
}
