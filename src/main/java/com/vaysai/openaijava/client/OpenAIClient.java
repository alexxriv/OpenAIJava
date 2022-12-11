package com.vaysai.openaijava.client;

import com.vaysai.openaijava.model.request.completion.CompletionRequest;
import com.vaysai.openaijava.model.request.edits.EditsRequest;
import com.vaysai.openaijava.model.request.embeddings.CreateEmbeddingsRequest;
import com.vaysai.openaijava.model.request.files.UploadFileRequest;
import com.vaysai.openaijava.model.request.images.CreateImageEditsRequest;
import com.vaysai.openaijava.model.request.images.CreateImageRequest;
import com.vaysai.openaijava.model.request.images.CreateImageVariationsRequest;
import com.vaysai.openaijava.model.request.moderations.CreateModerationsRequest;
import com.vaysai.openaijava.model.response.completions.CompletionResponse;
import com.vaysai.openaijava.model.response.edits.EditsResponse;
import com.vaysai.openaijava.model.response.embeddings.CreateEmbeddingsResponse;
import com.vaysai.openaijava.model.response.files.DeleteFileResponse;
import com.vaysai.openaijava.model.response.files.ListFilesResponse;
import com.vaysai.openaijava.model.response.files.RetrieveFileResponse;
import com.vaysai.openaijava.model.response.files.UploadFilesResponse;
import com.vaysai.openaijava.model.response.finetunes.CancelFineTuneResponse;
import com.vaysai.openaijava.model.response.finetunes.ListFineTunesResponse;
import com.vaysai.openaijava.model.response.images.CreateImageEditsResponse;
import com.vaysai.openaijava.model.response.images.CreateImageResponse;
import com.vaysai.openaijava.model.response.images.CreateImageVariationsResponse;
import com.vaysai.openaijava.model.response.models.ListModelsResponse;
import com.vaysai.openaijava.model.response.models.RetrieveModelResponse;
import com.vaysai.openaijava.model.response.moderations.CreateModerationsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "openAIApi", url = "${openAIApi.url}", configuration = OpenAIFeignConfig.class)
public interface OpenAIClient {

    //Models

    //GET https://api.openai.com/v1/models
    @GetMapping(value = "/models", consumes = "application/json")
    ListModelsResponse listModels();

    //GET https://api.openai.com/v1/models/{model}
    @GetMapping(value = "/models", consumes = "application/json")
    RetrieveModelResponse retrieveModel();


    //Completions
    //POST
    //
    //https://api.openai.com/v1/completions
    @PostMapping(value = "/completions", consumes = "application/json")
    CompletionResponse createCompletion(CompletionRequest completionRequest);

    //Edits

    //POST https://api.openai.com/v1/edits
    @PostMapping(value="/edits", consumes = "application/json")
    EditsResponse createEdit(EditsRequest editsRequest);

    //Images

    //POST https://api.openai.com/v1/images/generations
    @PostMapping(value="/images/generations",consumes = "application/json")
    CreateImageResponse createImageGenerations(CreateImageRequest createImageReques);


    //POST https://api.openai.com/v1/images/generations
    @PostMapping(value="/images/edits",consumes = "application/json")
    CreateImageEditsResponse createImageEdits(CreateImageEditsRequest createImageEditsRequest);

    //POST https://api.openai.com/v1/images/variations
    @PostMapping(value="/images/variations",consumes = "application/json")
    CreateImageVariationsResponse createdImageVariations(CreateImageVariationsRequest createdImageVariationsRequest);



    @GetMapping(value="/files", consumes = "application/json")
    ListFilesResponse listFiles();

    @PostMapping(value="/files", consumes = "application/json")
    UploadFilesResponse uploadFile(UploadFileRequest uploadFileRequest);

    //DELETE https://api.openai.com/v1/files/{file_id}
    @DeleteMapping(value="/files/{file_id}", consumes = "application/json")
    DeleteFileResponse deleteFile(@PathVariable("file_id") String fileId);

    @GetMapping(value="/files/{file_id}", consumes = "application/json")
    RetrieveFileResponse retrieveFile(@PathVariable("file_id") String fileId);

    @GetMapping(value="/files/{file_id}/content}", consumes="application/json")
    ResponseEntity<?> retrieveFileContent(@PathVariable("file_id") String fileId);

    @PostMapping(value="/fine-tunes", consumes="application/json")
    CreateFineTuneResponse createFileTune(CreateFineTuneRequest createFileTuneRequest);

    @GetMapping(value="/fine-tunes", consumes="application/json")
    ListFineTunesResponse listFineTunes();

    @GetMapping(value="/fine-tunes/{fine_tune_id}", consumes = "application/json")
    RetrieveFineTuneResponse retrieveFineTune(@PathVariable("fine_tune_id") String fineTuneId);

    @PostMapping(value="/fine-tunes/{fine_tune_id}/cancel")
    CancelFineTuneResponse cancelFineTune(@PathVariable("fine_tune_id") String fineTuneId);

    @GetMapping(value="/fine-tunes/{fine_tune_id}/events", consumes = "application/json")
    ListFineTuneEvents listFineTunes(@PathVariable("fine_tune_id") String fineTuneId);

    @DeleteMapping(value="/models/{model}", consumes = "application/json")
    DeleteFineTuneModel deleteFineTuneModel(@PathVariable("model") String model);



    @PostMapping(value="embeddings",consumes = "application/json")
    CreateEmbeddingsResponse createEmbeddings(CreateEmbeddingsRequest createEmbeddingsRequest);

    @PostMapping(value="moderations",consumes = "application/json")
    CreateModerationsResponse createModerations(CreateModerationsRequest createModerationsRequest);

}