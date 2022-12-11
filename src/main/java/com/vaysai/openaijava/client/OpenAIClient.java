package com.vaysai.openaijava.client;

import com.vaysai.openaijava.model.request.completion.CompletionRequest;
import com.vaysai.openaijava.model.request.edits.EditsRequest;
import com.vaysai.openaijava.model.request.files.UploadFileRequest;
import com.vaysai.openaijava.model.response.completions.CompletionResponse;
import com.vaysai.openaijava.model.response.edits.EditsResponse;
import com.vaysai.openaijava.model.response.files.DeleteFileResponse;
import com.vaysai.openaijava.model.response.files.ListFilesResponse;
import com.vaysai.openaijava.model.response.files.RetrieveFileResponse;
import com.vaysai.openaijava.model.response.files.UploadFilesResponse;
import com.vaysai.openaijava.model.response.models.ListModelsResponse;
import com.vaysai.openaijava.model.response.models.RetrieveModelResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@FeignClient(name = "openAIApi", url = "${openAIApi.url}", configuration = OpenAIFeignConfig.class)
public interface OpenAIClient {

    @GetMapping(value = "/models", consumes = "application/json")
    ListModelsResponse listModels();

    @GetMapping(value = "/models", consumes = "application/json")
    RetrieveModelResponse retrieveModel();

    @PostMapping(value = "/completions", consumes = "application/json")
    CompletionResponse createCompletion(CompletionRequest completionRequest);

    @PostMapping(value="/edits", consumes = "application/json")
    EditsResponse createEdit(EditsRequest editsRequest);

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


    @GetMapping(value="/fine-tunes", content="application/json")
    ListFineTunesResponse listFineTunes();

    @GetMapping(value="/fine-tunes/{fine_tune_id}", consumes = "application/json")
    RetrieveFineTuneResponse retrieveFineTune(@PathVariable("fine_tune_id") String fineTuneId);

    @PostMapping(value="/fine-tunes/{fine_tune_id}/cancel")
    CancelFineTuneResponse cancelFineTune(@PathVariable("fine_tune_id") String fineTuneId);

    @GetMapping(value="/fine-tunes/{fine_tune_id}/events", consumes = "application/json")
    Ca

    @PostMapping(value="/images/generations",consumes = "application/json")
    CreateImageResponse createImageGenerations(CreateImageRequest createImageReques);

    @PostMapping(value="/images/edits",consumes = "application/json")
    CreateImageEditsResponse createImageEdits(CreateImageEditsRequest createImageEditsRequest);

    @PostMapping(value="/images/variations",consumes = "application/json")
    CreateImageVariationsResponse createdImageVariations(CreateImageVariationsRequest createdImageVariationsRequest);

    @PostMapping(value="embeddings",consumes = "application/json")
    CreateEmbeddingsResponse createEmbeddings(CreateEmbeddingsRequest createEmbeddingsRequest);

    @PostMapping(value="moderations",consumes = "application/json")
    CreateModerationsResponse createModerations(CreateModerationsRequest createModerationsRequest);

}