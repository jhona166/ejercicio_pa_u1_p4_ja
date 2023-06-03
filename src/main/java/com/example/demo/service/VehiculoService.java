package com.example.demo.service;

import com.example.demo.repository.modelo.Vehiculo;

public interface VehiculoService {
	public void guardar(Vehiculo vehiculo);
	public void actualiza(Vehiculo vehiculo);
	public void borrar(String placa);
	public Vehiculo seleccionarPorPlaca(String placa);
}
