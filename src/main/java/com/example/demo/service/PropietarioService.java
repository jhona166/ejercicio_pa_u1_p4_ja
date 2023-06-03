package com.example.demo.service;

import com.example.demo.repository.modelo.Propietario;

public interface PropietarioService {
	public void guardar(Propietario propietario);
	public void eliminar(String identificacion);
	public Propietario seleccionarPorIdentificacion(String placa);
}
