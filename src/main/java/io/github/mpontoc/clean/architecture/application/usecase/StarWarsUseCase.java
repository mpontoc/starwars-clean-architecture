package io.github.mpontoc.clean.architecture.application.usecase;

import io.github.mpontoc.clean.architecture.application.entity.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.gateway.StarWarsGatewayImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class StarWarsUseCase {

    private final StarWarsGatewayImpl gateway;

    public StarWarsPeopleModel getPeople(String id) {
        return gateway.getPeople(id);
    }

}
