package io.github.mpontoc.clean.architecture.application.dataprovider.service.mapper;

import io.github.mpontoc.clean.architecture.application.core.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.application.dataprovider.service.model.api.StarWarsApiResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StarWarsMapperService {
    StarWarsPeopleModel toModel(StarWarsApiResponse response);
}
