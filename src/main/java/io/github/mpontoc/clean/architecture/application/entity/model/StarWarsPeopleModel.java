package io.github.mpontoc.clean.architecture.application.entity.model;

import lombok.Data;

@Data
public class StarWarsPeopleModel {
    private String name;
    private String gender;
    private String skinColor;
    private String hairColor;
    private String eyeColor;
    private String birthYear;
}
