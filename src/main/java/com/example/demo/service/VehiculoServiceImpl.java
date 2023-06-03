package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Vehiculo;
@Service
public class VehiculoServiceImpl implements VehiculoService {
	@Autowired
	private VehiculoRepository vehiculoRepository;
	@Override
	public void guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.crear(vehiculo);
	}

	@Override
	public void actualiza(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.actualiza(vehiculo);
	}

	@Override
	public void borrar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepository.eliminar(placa);
	}

	@Override
	public Vehiculo seleccionarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepository.seleccionarPorPlaca(placa);
	}

}
