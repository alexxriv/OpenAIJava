package com.vaysai.openaijava;


import com.vaysai.openaijava.annotation.EnableOpenAIClient;
import com.vaysai.openaijava.client.OpenAIClient;
import com.vaysai.openaijava.configuration.YamlPropertySourceFactory;
import com.vaysai.openaijava.model.completions.CreateCompletionRequest;
import com.vaysai.openaijava.model.completions.CreateCompletionResponse;
import com.vaysai.openaijava.model.edits.CreateEditRequest;
import com.vaysai.openaijava.model.edits.CreateEditResponse;
import com.vaysai.openaijava.model.embeddings.CreateEmbeddingsRequest;
import com.vaysai.openaijava.model.embeddings.CreateEmbeddingsResponse;
import com.vaysai.openaijava.model.files.ListFilesResponse;
import com.vaysai.openaijava.model.files.UploadFileRequest;
import com.vaysai.openaijava.model.files.UploadFilesResponse;
import com.vaysai.openaijava.model.images.*;
import com.vaysai.openaijava.model.models.ListModelsResponse;
import com.vaysai.openaijava.model.models.RetrieveModelResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Log4j2
@EnableOpenAIClient
@ExtendWith(SpringExtension.class)
@EnableAutoConfiguration
@ContextConfiguration(classes = {YamlPropertySourceFactory.class})
class OpenAiJavaApplicationTests {


	@Autowired
	OpenAIClient openAIClient;

	@Test
	void listModels(){

		ListModelsResponse listModelsResponse = openAIClient.listModels();
		log.info(listModelsResponse);
	}

	@Test
	void retrieveModel(){

		RetrieveModelResponse retrieveModelResponse = openAIClient.retrieveModel("text-davinci-003");
		log.info(retrieveModelResponse);
	}

	@Test
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

	@Test
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


	@Test
	void createImage(){
		CreateImageRequest request = CreateImageRequest.builder()
				.prompt("A cute baby sea otter")
				.numberOfImages(2)
				.size("1024x1024").build();

		CreateImageResponse response = openAIClient.createImage(request);
		log.info(response);
	}


	@Test
	void createImageEdit() throws IOException{

		MultipartFile image = new MockMultipartFile("image.png","image.png", "image/png", new FileInputStream(new File("src/test/resources/image.png")));
		MultipartFile mask = new MockMultipartFile("mask.png","mask.png", "image/png", new FileInputStream(new File("src/test/resources/mask.png")));

		Assertions.assertNotNull(image);
		//Assertions.assertNotNull(mask);
		CreateImageEditRequest request = CreateImageEditRequest.builder()
				.image(image)
				.mask(mask)
				.prompt("A golden apple in the middle of space")
				.size("1024x1024")
				.build();

		CreateImageEditResponse response = openAIClient.createImageEdit(request);
		log.info(response);


	}



	@Test
	void createImageVariation() throws IOException{
		MultipartFile image = new MockMultipartFile("image.png","image.png", "image/png", new FileInputStream(new File("src/test/resources/image.png")));

		CreateImageVariationRequest request = CreateImageVariationRequest.builder()
				.image(image)
				.n(2)
				.size("1024x1024")
				.build();

		CreateImageVariationResponse response =  openAIClient.createdImageVariation(request);

		log.info(response);
	}


	@Test
	void createEmbeddings(){

		CreateEmbeddingsRequest request = CreateEmbeddingsRequest.builder()
				.model("text-similarity-babbage-001")
				.input("The food was delicious and the waiter was in a good mood")
				.build();

		CreateEmbeddingsResponse response = openAIClient.createEmbeddings(request);
		log.info(response);


	}

	@Test
	void listFiles(){

		ListFilesResponse response = openAIClient.listFiles();

		log.info(response);
	}

	@Test
	void uploadFile() throws IOException{
		MultipartFile image = new MockMultipartFile("data.jsonl","data.jsonl", "application/x-ndjson", new FileInputStream(new File("src/test/resources/data.jsonl")));
		UploadFileRequest request = UploadFileRequest.builder()
				.file(image)
				.purpose("fine-tune")
				.build();
		UploadFilesResponse response = openAIClient.uploadFile(request);

		log.info(response);

	}


	@Test
	void deleteFile(){

	}

	@Test
	void retrieveFile(){

	}

	@Test
	void retrieveFileContent(){

	}


	void createFineTune(){

	}

	void listFineTune(){

	}

	void retrieveFineTune(){

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
