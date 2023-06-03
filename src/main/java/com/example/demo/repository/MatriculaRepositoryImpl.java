package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@Repository
public class MatriculaRepositoryImpl implements MatriculaRepository {

	@Override
	public Matricula crear(String identificacion, String placa) {
		// TODO Auto-generated method stub
		return null;
	}

}
