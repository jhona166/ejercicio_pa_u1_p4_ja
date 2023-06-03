package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.MatriculaRepository;
import com.example.demo.repository.PropietarioRepository;
import com.example.demo.repository.VehiculoRepository;
import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements MatriculaService{

	@Autowired
	private MatriculaRepository MatriculaRepo;

	@Autowired
	private PropietarioRepository PropietarioRepo;

	@Autowired
	private VehiculoRepository VehiculoRepo;
	
	
	@Autowired
	@Qualifier("automatico")
	private ValorMatricula ValorMatricula;

	@Override
	public void realizar(String identificacion, String placa) {
		// TODO Auto-generated method stub
		Propietario propi=this.PropietarioRepo.seleccionarPorIdentificacion(identificacion);
		Vehiculo vehi=this.VehiculoRepo.seleccionarPorPlaca(placa);

		Matricula mat=new Matricula();
		mat.setFecha(LocalDateTime.now());
		mat.setPropietario(propi);
		mat.setVehiculo(vehi);

		BigDecimal valorMatri=this.ValorMatricula.valorMatricula(vehi.getPrecio());

		if(valorMatri.compareTo(new BigDecimal(2000))>0) {
			BigDecimal valorDescuento=valorMatri.multiply(new BigDecimal(0.09));
			BigDecimal valorConDescuento=valorMatri.subtract(valorDescuento);
			valorMatri=valorConDescuento;
		}


		mat.setValor(valorMatri);




		this.MatriculaRepo.crear(identificacion, placa);
	}

}