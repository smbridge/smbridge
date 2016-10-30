package de.fcernota;

import de.fcernota.entity.Feed;
import de.fcernota.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaRepositories("de.fcernota.*")
@ComponentScan
@EnableScheduling
public class SmBridgeApplication {


	public static void main(String[] args) {
		SpringApplication.run(SmBridgeApplication.class, args);

	}
}
