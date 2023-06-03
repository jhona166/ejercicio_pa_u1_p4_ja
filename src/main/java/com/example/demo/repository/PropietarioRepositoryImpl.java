package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepositoryImpl implements PropietarioRepository{
	private static List<Propietario> baseDatos = new ArrayList<>();
	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		baseDatos.add(propietario);
	}

	@Override
	public void eliminar(String identificacion) {
		// TODO Auto-generated method stub
		Propietario propietario  = this.seleccionarPorIdentificacion(identificacion);
		baseDatos.remove(propietario);
	}

	@Override
	public Propietario seleccionarPorIdentificacion(String placa) {
		// TODO Auto-generated method stub
		Propietario propieEncontrado= new Propietario();

		for(Propietario propi:baseDatos) {
			if(placa.equals(propi.getIdentificacion())) {
				propieEncontrado= propi;
			}else {

			}
		}
		return propieEncontrado;
	}

}
