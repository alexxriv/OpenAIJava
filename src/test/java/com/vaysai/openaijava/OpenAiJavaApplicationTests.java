package com.vaysai.openaijava;


import com.vaysai.openaijava.client.OpenAIClient;
import com.vaysai.openaijava.model.models.ListModelsResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.junit4.SpringRunner;

@Log4j2
@RunWith(SpringRunner.class)
public class OpenAiJavaApplicationTests {

	@Autowired
	OpenAIClient openAIClient;
	public void contextLoads() {

	}

	@Test
	public void listModels(){
		ListModelsResponse listModelsResponse=  openAIClient.listModels();
		log.info(listModelsResponse);
	}

}
