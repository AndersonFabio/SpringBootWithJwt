package br.com.teste.jwtautenticate;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import br.com.teste.rest.Home;
import br.com.teste.rest.TestRest;

@Component
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() {
		register(TestRest.class);
		register(Home.class);
	}

}
