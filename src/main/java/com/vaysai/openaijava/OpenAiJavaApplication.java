package com.vaysai.openaijava;

import com.vaysai.openaijava.annotation.EnableOpenAIClient;
import com.vaysai.openaijava.client.OpenAIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;


@SpringBootApplication(exclude = {
		DataSourceAutoConfiguration.class,
		DataSourceTransactionManagerAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})
@EnableOpenAIClient
public class OpenAiJavaApplication {


	public static void main(String[] args) {


		SpringApplication.run(OpenAiJavaApplication.class, args);
	}

}
