package com.microservicio.afp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import com.microservicio.afp.controller.ClientController;
import com.microservicio.afp.modelo.Client;
import com.microservicio.afp.repository.IclientRepository;


@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {
	@InjectMocks
	ClientController controlador;


	@Before
	public void setup() throws Exception {
		//testOk();
	}

	@Test
	public void getAllNameTestErrorNull() {
		List<Client> dfd = controlador.getAllName();
		assertEquals(null,dfd);
		//assertNotNull(null);
		//assertEquals("Carlos", response.getUsuarios().get(0).getNombre());
	}
	
	@Test
	public void getAllNameTestErrorNull() {
		List<Client> dfd = controlador.getAllName();
		assertEquals(null,dfd);
		//assertNotNull(null);
		//assertEquals("Carlos", response.getUsuarios().get(0).getNombre());
	}
	
}
