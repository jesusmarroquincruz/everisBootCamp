package com.microservicio.afp.modelo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(value="client")
public class Client {
	
	@Id
	private String client_id;
	private String client_name;
	private String client_surname;
	private String client_dni;
	private String client_telefono;
	private String client_correo;
	private String client_afp_nombre;
	private String client_afp_tipo;
	private String client_afp_saldo;
	
	
}
