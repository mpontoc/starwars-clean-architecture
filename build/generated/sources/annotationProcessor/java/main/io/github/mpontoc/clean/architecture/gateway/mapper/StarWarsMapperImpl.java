package io.github.mpontoc.clean.architecture.gateway.mapper;

import io.github.mpontoc.clean.architecture.application.entity.model.StarWarsPeopleModel;
import io.github.mpontoc.clean.architecture.gateway.model.StarWarsApiResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-07T23:09:55-0300",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.7.jar, environment: Java 17.0.10 (Amazon.com Inc.)"
)
@Component
public class StarWarsMapperImpl implements StarWarsMapper {

    @Override
    public StarWarsPeopleModel toModel(StarWarsApiResponse response) {
        if ( response == null ) {
            return null;
        }

        StarWarsPeopleModel starWarsPeopleModel = new StarWarsPeopleModel();

        starWarsPeopleModel.setHairColor( response.getHairColor() );
        starWarsPeopleModel.setBirthYear( response.getBirthYear() );
        starWarsPeopleModel.setEyeColor( response.getEyeColor() );
        starWarsPeopleModel.setName( response.getName() );
        starWarsPeopleModel.setGender( response.getGender() );
        starWarsPeopleModel.setSkinColor( response.getSkinColor() );

        return starWarsPeopleModel;
    }

    @Override
    public StarWarsApiResponse toResponse(String response) {
        if ( response == null ) {
            return null;
        }

        StarWarsApiResponse starWarsApiResponse = new StarWarsApiResponse();

        return starWarsApiResponse;
    }
}
