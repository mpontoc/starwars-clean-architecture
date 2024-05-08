package io.github.mpontoc.clean.architecture.application.entrypoint.controller;

import io.github.mpontoc.clean.architecture.application.entrypoint.mapper.StarWarsMapperResponse;
import io.github.mpontoc.clean.architecture.application.entrypoint.model.response.DataResponse;
import io.github.mpontoc.clean.architecture.application.entrypoint.model.response.StarWarsPeopleResponse;
import io.github.mpontoc.clean.architecture.application.core.usecase.StarWarsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StarWarsController {
    private final StarWarsUseCase starWarsUseCase;
    private final StarWarsMapperResponse mapper;

    @GetMapping("/people/{id}")
    public ResponseEntity<DataResponse> getPeople(
            @PathVariable String id
    ) {
        StarWarsPeopleResponse starWarsPeopleResponse = mapper.toResponse(starWarsUseCase.getPeople(id));
        DataResponse<StarWarsPeopleResponse> response = new DataResponse<>(starWarsPeopleResponse);
        return ResponseEntity.ok(response);
    }

}
