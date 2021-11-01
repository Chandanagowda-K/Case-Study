package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.Model.Patient_login ;

@Repository
	public interface Patient_loginRepository  extends JpaRepository<Patient_login ,Long>{
}
