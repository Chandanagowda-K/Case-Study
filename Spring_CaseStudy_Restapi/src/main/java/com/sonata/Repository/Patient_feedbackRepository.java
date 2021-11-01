package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.Model.Patient_feedback ;

@Repository

public interface Patient_feedbackRepository extends JpaRepository<Patient_feedback ,Long>{ 

}
