package io.github.mpontoc.clean.architecture.application.entrypoint.mapper;

import io.github.mpontoc.clean.architecture.application.core.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.application.dataprovider.service.model.api.StarWarsApiResponse;
import io.github.mpontoc.clean.architecture.application.entrypoint.model.response.StarWarsPeopleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface StarWarsMapperResponse {
    StarWarsPeopleResponse toResponse(StarWarsPeopleModel model);
}
