package com.sonata.Prescription;

import java.util.List;


public interface PrescriptionDao {
	 public default int save(Object object) throws ClassNotFoundException {
			return 0;
		}
	}
