package edu.icet.repository;

import edu.icet.entity.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepository extends JpaRepository<PatientEntity,Long> {
    List<PatientEntity> findByFullName(String name);
}
