package com.example.dropboxsfileservice.controller;

import com.example.dropboxsfileservice.model.dto.FileMetaRs;
import com.example.dropboxsfileservice.support.DataProvider;
import com.example.dropboxsfileservice.support.IntegrationTestBase;
import org.junit.jupiter.api.Test;
import org.springframework.core.ParameterizedTypeReference;
import ru.gmm.demo.model.api.UploadFileDto;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FileMetaDataControllerTest extends IntegrationTestBase {

    @Test
    @SuppressWarnings("LineLength")
    void getMetaFilesShouldWork() {
        final UploadFileDto upload = DataProvider.prepareFile().build();
        final UploadFileDto upload2 = UploadFileDto.builder()
                .name("example2")
                .base64Data("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")
                .userId(1L)
                .build();
        final UploadFileDto upload3 = UploadFileDto.builder()
                .name("example3")
                .base64Data("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")
                .userId(1L)
                .build();
        fileDocumentService.uploadFile(upload);
        fileDocumentService.uploadFile(upload2);
        fileDocumentService.uploadFile(upload3);

        assertThat(getMetaFiles(upload2.getUserId()))
                .isEqualTo(fileDocumentService.getAllMetaFiles(upload3.getUserId()));;

    }

    private List<FileMetaRs> getMetaFiles(final Long id) {
        return webTestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .pathSegment("api", "v1", "files", "meta", String.valueOf(id))
                        .build())
                .exchange()
                .expectStatus().isEqualTo(200)
                .expectBody(new ParameterizedTypeReference<List<FileMetaRs>>() {
                })
                .returnResult()
                .getResponseBody();
    }
}
