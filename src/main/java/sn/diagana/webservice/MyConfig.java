package sn.diagana.webservice;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sn.diagana.webservice.Web.CompteJAXRSAPIRest;

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig jesery = new ResourceConfig( );
        jesery.register(CompteJAXRSAPIRest.class);

        return jesery;
    }
}



