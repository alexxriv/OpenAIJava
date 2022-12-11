package com.vaysai.openaijava;


import com.vaysai.openaijava.annotation.EnableOpenAIClient;
import com.vaysai.openaijava.client.OpenAIClient;
import com.vaysai.openaijava.model.completions.CompletionRequest;
import com.vaysai.openaijava.model.completions.CompletionResponse;
import com.vaysai.openaijava.model.models.ListModelsResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Log4j2
@EnableOpenAIClient
@SpringBootTest(classes = OpenAiJavaApplication.class)
class OpenAiJavaApplicationTests {

	@Autowired
	OpenAIClient openAIClient;
	public void contextLoads() {

	}

	@Test
	void listModels(){

	}

	@Test
	void createCompletion(){
		CompletionRequest completionRequest = CompletionRequest
				.builder()
				.model("text-davinci-003")
				.prompt("Say this is a test")
				.maxTokens(7)
				.temperature(0.0).build();

		CompletionResponse completionResponse = openAIClient.createCompletion(completionRequest);
		log.info(completionResponse.getChoices().get(0).getText());
	}



}
