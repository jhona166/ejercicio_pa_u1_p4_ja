package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Matricula;
import com.example.demo.repository.modelo.Propietario;
import com.example.demo.repository.modelo.Vehiculo;
import com.example.demo.service.MatriculaService;
import com.example.demo.service.PropietarioService;
import com.example.demo.service.VehiculoService;

@SpringBootApplication
public class EjercicioPaU1P4JaApplication implements CommandLineRunner {
	@Autowired
	private VehiculoService vehiculoService;

	@Autowired
	private PropietarioService propietarioService;

	@Autowired
	private MatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU1P4JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo vehi=new Vehiculo();
		vehi.setMarca("Chevrolet");
		vehi.setModelo("Aveo");
		vehi.setPlaca("123");
		vehi.setPrecio(new BigDecimal(12000));
		vehi.setTipo("automatico");
		this.vehiculoService.guardar(vehi);
		System.out.println(vehi);


		vehi.setMarca("Renault");
		vehi.setModelo("Cx3");
		this.vehiculoService.actualiza(vehi);

		System.out.println(vehi);

		Propietario propi=new Propietario();
		propi.setApellido("Altamirano");
		propi.setFechaNacimiento(LocalDateTime.of(1999, 03, 16,03,25));
		propi.setNombre("Jhonatan");
		propi.setIdentificacion("1727501510");
		this.propietarioService.guardar(propi);

		System.out.println(propi);

		this.matriculaService.realizar(propi.getIdentificacion(), vehi.getPlaca());

		
	}

}
