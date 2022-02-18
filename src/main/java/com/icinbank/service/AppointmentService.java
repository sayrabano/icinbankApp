package com.icinbank.service;

import java.util.List;

import com.icinbank.model.Appointment;





public interface AppointmentService {
	Appointment createAppointment(Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}

