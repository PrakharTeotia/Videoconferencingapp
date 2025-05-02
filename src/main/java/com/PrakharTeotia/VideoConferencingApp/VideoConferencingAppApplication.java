package com.PrakharTeotia.VideoConferencingApp;

import com.PrakharTeotia.VideoConferencingApp.user.User;
import com.PrakharTeotia.VideoConferencingApp.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideoConferencingAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(VideoConferencingAppApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	){
		return args -> {
			service.register(User.builder()
					.username("Prakhar")
					.email("Prakharteotia77@gmail.com")
					.password("xyz")
					.build());

			service.register(User.builder()
					.username("Pranav")
					.email("Pranavteotia77@gmail.com")
					.password("xyz")
					.build());

			service.register(User.builder()
					.username("jaat")
					.email("Prakhteotia77@gmail.com")
					.password("xyz")
					.build());
		};
	}

}
