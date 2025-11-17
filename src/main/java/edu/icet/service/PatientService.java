package edu.icet.service;

import edu.icet.dto.Patient;

import java.util.List;

public interface PatientService {
    void addPatient(Patient patient);
    List<Patient> getAll();
    void deletePatient(Long id);
    void updatePatient(Patient patient);
    Patient searchById(Long id);
    List<Patient>searchByFullName(String fullName);
    Patient searchByEmail(String email);

}
