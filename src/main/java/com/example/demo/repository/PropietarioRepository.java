package com.example.demo.repository;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

public interface PropietarioRepository {
	public void crear(Propietario propietario);
	public void eliminar(String identificacion);
	public Propietario seleccionarPorIdentificacion(String placa);

}
