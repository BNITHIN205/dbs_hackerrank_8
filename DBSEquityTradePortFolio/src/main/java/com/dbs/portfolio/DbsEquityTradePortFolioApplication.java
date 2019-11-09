package com.dbs.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dbs.portfolio.repository.DbsEquityTradePortFolioInterface;


@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = DbsEquityTradePortFolioInterface.class)
@ComponentScan
//@EnableSwagger2
public class DbsEquityTradePortFolioApplication {
	public static void main(String[] args) {
		SpringApplication.run(DbsEquityTradePortFolioApplication.class, args);
	}
}
