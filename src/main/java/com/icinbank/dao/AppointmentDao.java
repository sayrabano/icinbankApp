package com.icinbank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.icinbank.model.Appointment;

public interface AppointmentDao extends CrudRepository<Appointment,Long> {
	  List<Appointment> findAll();
	  
}
