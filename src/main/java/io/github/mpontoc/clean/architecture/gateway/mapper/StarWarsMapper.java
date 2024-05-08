package io.github.mpontoc.clean.architecture.gateway.mapper;

import io.github.mpontoc.clean.architecture.application.entity.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.gateway.model.StarWarsApiResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StarWarsMapper {
    StarWarsPeopleModel toModel(StarWarsApiResponse response);
}
