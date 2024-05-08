package io.github.mpontoc.clean.architecture.gateway.mapper;

import io.github.mpontoc.clean.architecture.application.entity.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.gateway.model.StarWarsApiResponse;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StarWarsMapper {
//    @Mapping(target = "height", defaultValue = "0") // Provide default value for height if it's null
    StarWarsPeopleModel toModel(StarWarsApiResponse response);
    @InheritInverseConfiguration
    StarWarsApiResponse toResponse(String response);

}
