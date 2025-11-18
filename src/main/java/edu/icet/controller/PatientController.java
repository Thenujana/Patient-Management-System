//package edu.icet.controller;
//
//import edu.icet.dto.Patient;
//import edu.icet.service.PatientService;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/patients")
//@RequiredArgsConstructor
//@CrossOrigin(origins = "http://localhost:3000")
//public class PatientController {
//
//    private final PatientService patientService;
//
//
//    @PostMapping
//    public ResponseEntity<String> addPatient(@Valid @RequestBody Patient patient) {
//        patientService.addPatient(patient);
//        return ResponseEntity.ok("Patient added successfully");
//    }
//
//
//    @GetMapping
//    public ResponseEntity<List<Patient>> getAllPatients() {
//        return ResponseEntity.ok(patientService.getAll());
//    }
//
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
//        Patient patient = patientService.searchById(id);
//        return ResponseEntity.ok(patient);
//    }
//
//
//    @GetMapping("/search/name")
//    public ResponseEntity<List<Patient>> searchByFullName(@RequestParam String name) {
//        return ResponseEntity.ok(patientService.searchByFullName(name));
//    }
//
//
//    @GetMapping("/search/email")
//    public ResponseEntity<Patient> searchByEmail(@RequestParam String email) {
//        return ResponseEntity.ok(patientService.searchByEmail(email));
//    }
//
//
//    @PutMapping("/{id}")
//    public ResponseEntity<String> updatePatient(@PathVariable Long id, @Valid @RequestBody Patient patient) {
//        patient.setId(id);
//        patientService.updatePatient(patient);
//        return ResponseEntity.ok("Patient updated successfully");
//    }
//
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deletePatient(@PathVariable Long id) {
//        patientService.deletePatient(id);
//        return ResponseEntity.ok("Patient deleted successfully");
//    }
//}


package edu.icet.controller;

import edu.icet.dto.Patient;
import edu.icet.service.PatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class PatientController {

    private final PatientService patientService;

    @PostMapping("/add")
    public ResponseEntity<String> addPatient(@Valid @RequestBody Patient patient) {
        patientService.addPatient(patient);
        return ResponseEntity.ok("Patient added successfully");
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Patient>> getAllPatients() {
        return ResponseEntity.ok(patientService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Patient> getPatientById(@PathVariable Long id) {
        Patient patient = patientService.searchById(id);
        return ResponseEntity.ok(patient);
    }

    @GetMapping("/search-name/{name}")
    public ResponseEntity<List<Patient>> searchByFullName(@PathVariable String name) {
        return ResponseEntity.ok(patientService.searchByFullName(name));
    }

    @GetMapping("/search-email/{email}")
    public ResponseEntity<Patient> searchByEmail(@PathVariable String email) {
        return ResponseEntity.ok(patientService.searchByEmail(email));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updatePatient(@PathVariable Long id, @Valid @RequestBody Patient patient) {
        patient.setId(id);
        patientService.updatePatient(patient);
        return ResponseEntity.ok("Patient updated successfully");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
        return ResponseEntity.ok("Patient deleted successfully");
    }
}
