package io.github.mpontoc.clean.architecture.entrypoint.controller;

import io.github.mpontoc.clean.architecture.application.entity.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.application.usecase.StarWarsUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StarWarsController {
    private final StarWarsUseCase starWarsUseCase;

    @GetMapping("/people/{id}")
    public StarWarsPeopleModel getPeople(
            @PathVariable String id
    ) {
      return starWarsUseCase.getPeople(id);
    }


}
