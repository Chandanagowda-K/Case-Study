package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.Model.Doctor_login ;

@Repository
	public interface Doctor_loginRepository  extends JpaRepository<Doctor_login ,Long>{
}
