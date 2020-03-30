package fr.formation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.service.ICommandeService;
import fr.formation.service.IFactureService;
import fr.formation.service.IPlatService;
import fr.formation.service.IReservationService;
import fr.formation.service.IRoleService;
import fr.formation.service.ITableService;
import fr.formation.service.IUserService;

@SpringBootApplication
public class RestaurantApplication implements CommandLineRunner{
	
	@Autowired
	IUserService userservice;
	@Autowired
	ITableService tableservice;
	@Autowired
	IRoleService roleservice;
	@Autowired
	IReservationService reservationservice;
	@Autowired
	IPlatService platservice;
	@Autowired
	IFactureService factureservice;
	@Autowired
	ICommandeService commandeservice;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
