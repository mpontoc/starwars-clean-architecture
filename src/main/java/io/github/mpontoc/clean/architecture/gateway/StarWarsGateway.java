package io.github.mpontoc.clean.architecture.gateway;

import io.github.mpontoc.clean.architecture.application.entity.model.StarWarsPeopleModel;

public interface StarWarsGateway {

    StarWarsPeopleModel getPeople(String id);

}
