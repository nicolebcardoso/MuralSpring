package br.ufscar.dc.dsw.mural;

import br.ufscar.dc.dsw.mural.repositorios.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MuralApplication {

	public static void main(String[] args) {

		var context =
				SpringApplication.run(
						MuralApplication.class,
						args
				);

		var UserRepository =
				context.getBean(UserRepository.class);

		if (UserRepository.count() == 0) {

			UserRepository.save(
					"admin",
					"admin",
					"ADMIN"
			);

			UserRepository.save(
					"user",
					"user",
					"USER"
			);
		}
	}
}