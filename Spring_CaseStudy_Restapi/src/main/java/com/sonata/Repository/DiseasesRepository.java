package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.Model.Diseases ;

@Repository
	public interface DiseasesRepository  extends JpaRepository<Diseases ,Long>{
}
