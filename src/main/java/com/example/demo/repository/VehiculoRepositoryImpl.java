package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepositoryImpl implements VehiculoRepository{

	private static List<Vehiculo> baseDatos = new ArrayList<>();
	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		baseDatos.add(vehiculo);
	}

	@Override
	public void actualiza(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo.getPlaca());
		this.crear(vehiculo);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculo  = this.seleccionarPorPlaca(placa);
		baseDatos.remove(vehiculo);
	}

	@Override
	public Vehiculo seleccionarPorPlaca(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiEncontrado= new Vehiculo();

		for(Vehiculo  vehi:baseDatos) {
			if(placa.equals(vehi.getPlaca())) {
				vehiEncontrado = vehi;
			}else {

			}
		}
		return vehiEncontrado;
	}
}
