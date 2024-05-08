package io.github.mpontoc.clean.architecture.application.core.usecase.gateway;

import io.github.mpontoc.clean.architecture.application.core.model.StarWarsPeopleModel;

public interface StarWarsGateway {

    StarWarsPeopleModel getPeople(String id);

}
