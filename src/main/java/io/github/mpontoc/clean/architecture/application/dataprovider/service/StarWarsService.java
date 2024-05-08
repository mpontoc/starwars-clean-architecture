package io.github.mpontoc.clean.architecture.application.dataprovider.service;

import io.github.mpontoc.clean.architecture.application.core.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.application.core.usecase.gateway.StarWarsGateway;
import io.github.mpontoc.clean.architecture.application.dataprovider.service.mapper.StarWarsMapperService;
import io.github.mpontoc.clean.architecture.application.dataprovider.service.model.api.StarWarsApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class StarWarsService implements StarWarsGateway {

    private final StarWarsMapperService mapperImpl;
    @Override
    public StarWarsPeopleModel getPeople(String id) {

        RestClient defaultClient = RestClient.create();
        ResponseEntity<StarWarsApiResponse> result = defaultClient
                .get()
                .uri("https://swapi.dev/api/people/" + id)
                .retrieve()
                .toEntity(StarWarsApiResponse.class);

        return mapperImpl.toModel(result.getBody());

    }

}
