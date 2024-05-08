package io.github.mpontoc.clean.architecture.application.core.usecase;

import io.github.mpontoc.clean.architecture.application.core.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.application.dataprovider.service.StarWarsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StarWarsUseCase {

    private final StarWarsService gateway;

    public StarWarsPeopleModel getPeople(String id) {
        return gateway.getPeople(id);
    }

}
