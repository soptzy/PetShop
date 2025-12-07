package com.petshop.dto;
import java.time.*;
public record AppointmentDTO(String petName,String serviceType,LocalDateTime dateTime){}