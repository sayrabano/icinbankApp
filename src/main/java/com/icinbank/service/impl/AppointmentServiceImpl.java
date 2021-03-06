package com.icinbank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icinbank.dao.AppointmentDao;
import com.icinbank.model.Appointment;
import com.icinbank.service.AppointmentService;



@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private AppointmentDao appointmentDao;

	@Override
	public Appointment createAppointment(Appointment appointment) {
		 return appointmentDao.save(appointment);
	}

	@Override
	public List<Appointment> findAll() {
		 return appointmentDao.findAll();
	}


	public Appointment findAppointment(Long id) {
		 return appointmentDao.findOne(id);;
	}

	@Override
	public void confirmAppointment(Long id) {
		Appointment appointment = findAppointment(id);
        appointment.setConfirmed(true);
        appointmentDao.save(appointment);
		
	}

   
	}

