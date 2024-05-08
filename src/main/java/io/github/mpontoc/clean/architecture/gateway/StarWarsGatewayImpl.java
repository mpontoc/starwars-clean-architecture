package io.github.mpontoc.clean.architecture.gateway;

import io.github.mpontoc.clean.architecture.application.entity.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.gateway.mapper.StarWarsMapper;
import io.github.mpontoc.clean.architecture.gateway.model.StarWarsApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class StarWarsGatewayImpl implements StarWarsGateway {

    private final StarWarsMapper mapperImpl;
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
