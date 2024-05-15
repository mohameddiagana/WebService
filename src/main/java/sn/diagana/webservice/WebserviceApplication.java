package sn.diagana.webservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import sn.diagana.webservice.Model.Compte;
import sn.diagana.webservice.Model.TypeCompte;
import sn.diagana.webservice.Repository.CompteRepository;

import java.util.Date;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CompteRepository compteRepository){

		return args -> {
			compteRepository.save(new Compte( null,Math.random()*8000,new Date(), TypeCompte.COURANT ));
			compteRepository.save(new Compte( null,Math.random()*3000,new Date(), TypeCompte.EPARGNE ));
			compteRepository.save(new Compte( null,Math.random()*6000,new Date(), TypeCompte.EPARGNE ));
			compteRepository.save(new Compte( null,Math.random()*20000,new Date(), TypeCompte.COURANT ));

			compteRepository.findAll().forEach(c->{
				System.out.println(c.toString() );

			});

		};
	}

}
