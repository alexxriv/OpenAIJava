package com.vaysai.openaijava;


import com.vaysai.openaijava.client.OpenAIClient;
import com.vaysai.openaijava.model.models.ListModelsResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;

@Log4j2

public class OpenAiJavaApplicationTests {

	@Autowired
	OpenAIClient openAIClient;
	public void contextLoads() {

	}


	public void listModels(){
		ListModelsResponse listModelsResponse=  openAIClient.listModels();
		log.info(listModelsResponse);
	}

}
