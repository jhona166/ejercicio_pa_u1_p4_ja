package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements PropietarioService{
	@Autowired
	private PropietarioRepository propietarioRepository;
	@Override
	public void guardar(Propietario propietario) {
		// TODO Auto-generated method stub
		this.propietarioRepository.crear(propietario);
	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		this.propietarioRepository.eliminar(identificacion);
	}

	@Override
	public Propietario seleccionarPorIdentificacion(String placa) {
		// TODO Auto-generated method stub
		return propietarioRepository.seleccionarPorIdentificacion(placa);
	}

}
