package edu.icet.service.impl;

import edu.icet.dto.Patient;
import edu.icet.entity.PatientEntity;
import edu.icet.repository.PatientRepository;
import edu.icet.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {
    final PatientRepository patientRepository;
    final ModelMapper modelMapper;
    @Override
    public void addPatient(Patient patient) {
       patientRepository.save(modelMapper.map(patient, PatientEntity.class));
    }

    @Override
    public List<Patient> getAll() {
        return patientRepository.findAll()
                .stream()
                .map(entity -> modelMapper.map(entity, Patient.class))
                .collect(Collectors.toList());
    }

    @Override
    public void deletePatient(Long id) {
patientRepository.deleteById(id);
    }

    @Override
    public void updatePatient(Patient patient) {
patientRepository.save(modelMapper.map(patient,PatientEntity.class));
    }

    @Override
    public Patient searchById(Long id) {
        return modelMapper.map(patientRepository.findById(id),Patient.class);
    }

    @Override
    public List<Patient> searchByFullName(String fullName) {
        List<PatientEntity> byName =patientRepository.findByFullName(fullName);
        ArrayList<Patient>patientArrayList=new ArrayList<>();

        byName.forEach(PatientEntity ->{
            patientArrayList.add(modelMapper.map(PatientEntity,Patient.class));
        });
        return patientArrayList;
    }

    @Override
    public Patient searchByEmail(String email) {

        PatientEntity entity = patientRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Patient not found with email: " + email));

        return modelMapper.map(entity, Patient.class);
    }
}
