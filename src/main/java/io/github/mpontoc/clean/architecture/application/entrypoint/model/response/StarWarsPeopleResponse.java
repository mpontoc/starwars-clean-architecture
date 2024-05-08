package io.github.mpontoc.clean.architecture.application.entrypoint.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
//@JsonInclude(JsonInclude.Include.NON_NULL) //to send only fields with values not null
public class StarWarsPeopleResponse {
    private String name;
    private String gender;
    private String skinColor;
    private String hairColor;
    private String eyeColor;
    private String birthYear;
}
