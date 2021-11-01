package com.sonata.Dao_Pat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PatientDao {
          public int save(Object object);
          
       // public List<Patient> getData();
          // public int update(Object object);
          // public int delete(Object object);
}
