package com.vaysai.openaijava.client;

import com.vaysai.openaijava.model.completions.CreateCompletionRequest;
import com.vaysai.openaijava.model.edits.CreateEditRequest;
import com.vaysai.openaijava.model.embeddings.CreateEmbeddingsRequest;
import com.vaysai.openaijava.model.files.UploadFileRequest;
import com.vaysai.openaijava.model.finetunes.*;
import com.vaysai.openaijava.model.images.CreateImageEditRequest;
import com.vaysai.openaijava.model.images.CreateImageRequest;
import com.vaysai.openaijava.model.images.CreateImageVariationRequest;
import com.vaysai.openaijava.model.moderations.CreateModerationRequest;
import com.vaysai.openaijava.model.completions.CreateCompletionResponse;
import com.vaysai.openaijava.model.edits.CreateEditResponse;
import com.vaysai.openaijava.model.embeddings.CreateEmbeddingsResponse;
import com.vaysai.openaijava.model.files.DeleteFileResponse;
import com.vaysai.openaijava.model.files.ListFilesResponse;
import com.vaysai.openaijava.model.files.RetrieveFileResponse;
import com.vaysai.openaijava.model.files.UploadFilesResponse;
import com.vaysai.openaijava.model.images.CreateImageEditResponse;
import com.vaysai.openaijava.model.images.CreateImageResponse;
import com.vaysai.openaijava.model.images.CreateImageVariationResponse;
import com.vaysai.openaijava.model.models.ListModelsResponse;
import com.vaysai.openaijava.model.models.RetrieveModelResponse;
import com.vaysai.openaijava.model.moderations.CreateModerationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = "openai-client", url = "${openAIApi.url}")
public interface OpenAIClient {

    //Models

    @GetMapping(value = "/models", consumes = "application/json")
    ListModelsResponse listModels();

    @GetMapping(value = "/models/{model}", consumes = "application/json")
    RetrieveModelResponse retrieveModel(@PathVariable("model") String model);


    //Completions

    @PostMapping(value = "/completions", consumes = "application/json")
    CreateCompletionResponse createCompletion(CreateCompletionRequest createCompletionRequest);

    //Edits

    @PostMapping(value="/edits", consumes = "application/json")
    CreateEditResponse createEdit(CreateEditRequest createEditRequest);

    //Images

    @PostMapping(value="/images/generations",consumes = "application/json")
    CreateImageResponse createImage(CreateImageRequest createImageRequest);

    @PostMapping(value="/images/edits",consumes = "multipart/form-data")
    CreateImageEditResponse createImageEdit(CreateImageEditRequest createImageEditRequest);

    @PostMapping(value="/images/variations",consumes = "multipart/form-data")
    CreateImageVariationResponse createdImageVariation(CreateImageVariationRequest createdImageVariationsRequest);


    //Embeddings

    @PostMapping(value="/embeddings",consumes = "application/json")
    CreateEmbeddingsResponse createEmbeddings(CreateEmbeddingsRequest createEmbeddingsRequest);


    //Files

    @GetMapping(value="/files", consumes = "application/json")
    ListFilesResponse listFiles();

    @PostMapping(value="/files", consumes = "multipart/form-data")
    UploadFilesResponse uploadFile(UploadFileRequest uploadFileRequest);

    @DeleteMapping(value="/files/{file_id}", consumes = "application/json")
    DeleteFileResponse deleteFile(@PathVariable("file_id") String fileId);

    @GetMapping(value="/files/{file_id}", consumes = "application/json")
    RetrieveFileResponse retrieveFile(@PathVariable("file_id") String fileId);

    @GetMapping(value="/files/{file_id}/content", consumes="application/json")
    ResponseEntity<?> retrieveFileContent(@PathVariable("file_id") String fileId);


    //Fine Tunes

    @PostMapping(value="/fine-tunes", consumes="application/json")
    CreateFineTuneResponse createFineTune(CreateFineTuneRequest createFineTuneRequest);

    @GetMapping(value="/fine-tunes", consumes="application/json")
    ListFineTuneResponse listFineTunes();

    @GetMapping(value="/fine-tunes/{fine_tune_id}", consumes = "application/json")
    RetrieveFineTuneResponse retrieveFineTune(@PathVariable("fine_tune_id") String fineTuneId);

    @PostMapping(value="/fine-tunes/{fine_tune_id}/cancel")
    CancelFineTuneResponse cancelFineTune(@PathVariable("fine_tune_id") String fineTuneId);

    @GetMapping(value="/fine-tunes/{fine_tune_id}/events", consumes = "application/json")
    ListFineTuneEventsResponse listFineTuneEvents(@PathVariable("fine_tune_id") String fineTuneId);

    @DeleteMapping(value="/models/{model}", consumes = "application/json")
    DeleteFineTuneModelResponse deleteFineTuneModel(@PathVariable("model") String model);


    //Moderations

    @PostMapping(value="/moderations",consumes = "application/json")
    CreateModerationResponse createModeration(CreateModerationRequest createModerationRequest);

}