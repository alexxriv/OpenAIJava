package com.vaysai.openaijava;


import com.vaysai.openaijava.annotation.EnableOpenAIClient;
import com.vaysai.openaijava.client.OpenAIClient;
import com.vaysai.openaijava.configuration.OpenAIClientConfiguration;
import com.vaysai.openaijava.configuration.YamlPropertySourceFactory;
import com.vaysai.openaijava.model.completions.CreateCompletionRequest;
import com.vaysai.openaijava.model.completions.CreateCompletionResponse;
import com.vaysai.openaijava.model.edits.CreateEditRequest;
import com.vaysai.openaijava.model.edits.CreateEditResponse;
import com.vaysai.openaijava.model.images.*;
import com.vaysai.openaijava.model.models.ListModelsResponse;
import com.vaysai.openaijava.model.models.RetrieveModelResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@Log4j2
@EnableOpenAIClient
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration
@ContextConfiguration(classes = {YamlPropertySourceFactory.class})
class OpenAiJavaApplicationTests {


	@Autowired
	OpenAIClient openAIClient;
	public void contextLoads() {

	}

	void listModels(){

		ListModelsResponse listModelsResponse = openAIClient.listModels();
		log.info(listModelsResponse);
	}

	@Test
	void retrieveModel(){

		RetrieveModelResponse retrieveModelResponse = openAIClient.retrieveModel("text-davinci-003");
		log.info(retrieveModelResponse);
	}

	void createCompletion(){
		CreateCompletionRequest createCompletionRequest = CreateCompletionRequest
				.builder()
				.model("text-davinci-003")
				.prompt("Say this is a test")
				.maxTokens(7)
				.temperature(0.0).build();

		CreateCompletionResponse createCompletionResponse = openAIClient.createCompletion(createCompletionRequest);
		log.info(createCompletionResponse.getChoices().get(0).getText());
	}

	void createEdit(){
		CreateEditRequest request = CreateEditRequest.builder()
				.model("text-davinci-edit-001")
				.input("What day of the wek is it?")
				.instruction("Fix the spelling mistakes")
				.numberOfEdits(1)
				.build();
		CreateEditResponse createEditResponse = openAIClient.createEdit(request);

		log.info(createEditResponse);
	}


	void createImage(){
		CreateImageRequest request = CreateImageRequest.builder()
				.prompt("A cute baby sea otter")
				.numberOfImages(2)
				.size("1024x1024").build();

		CreateImageResponse response = openAIClient.createImage(request);
		log.info(response);

	}

	void createImageEdit(){
		CreateImageEditRequest request = CreateImageEditRequest.builder()
				.image("@otter.png")
				.mask("@mask.png")
				.prompt("A cute sea otter waering a beret")
				.size("1024x1024")
				.build();
		CreateImageEditResponse response = openAIClient.createImageEdit(request);

		log.info(response);

	}


	void createImageVariation(){
		CreateImageVariationRequest request = CreateImageVariationRequest.builder()
				.image("@otte.png")
				.numberOfImages(2)
				.size("1024x1024")
				.build();

		CreateImageVariationResponse response =  openAIClient.createdImageVariation(request);

		log.info(response);
	}

	void createEmbeddings(){

	}

	void listFiles(){

	}

	void uploadFile(){

	}


	void deleteFile(){

	}

	void dretrieveFile(){

	}

	void retrieveFileContent(){

	}


	void createFineTune(){

	}

	void listfineTune(){

	}

	void retrieveFineTUjne8(){

	}

	void cancelFineTune(){

	}
	void listFineTuneEvents(){

	}

	void deleteFineTuneModel(){

	}

	void createModeration(){

	}
}
