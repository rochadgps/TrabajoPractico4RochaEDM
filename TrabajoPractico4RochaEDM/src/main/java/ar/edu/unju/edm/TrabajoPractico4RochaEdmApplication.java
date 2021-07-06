package ar.edu.unju.edm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Cliente;
import ar.edu.unju.edm.service.IClienteService;

@SpringBootApplication
public class TrabajoPractico4RochaEdmApplication implements CommandLineRunner{
	@Autowired
	@Qualifier("impmysql")
	IClienteService clienteService;
	
	@Autowired
	Cliente cliente;
	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico4RochaEdmApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		// TODO Auto-generated method stub
//inicializo un cliente para pruebas
		
				/*cliente.setNroDocumento(100);
				cliente.setNombreApellido("rocha");
				cliente.setTipoDocumento("DNI");
				cliente.setEmail("correo@gmail.com");
				cliente.setFechaNacimiento(LocalDate.now());
				cliente.setFechaUltimaCompra(LocalDate.now());
				cliente.setPassword("nicole");						
				clienteService.guardarCliente(cliente);*/
		
	}
}
