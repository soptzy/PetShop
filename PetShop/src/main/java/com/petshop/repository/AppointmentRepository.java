package com.petshop.repository;
import com.petshop.model.*;import org.springframework.data.jpa.repository.JpaRepository;import java.util.*;
public interface AppointmentRepository extends JpaRepository<Appointment,Long>{List<Appointment> findByOwner(User o);} 