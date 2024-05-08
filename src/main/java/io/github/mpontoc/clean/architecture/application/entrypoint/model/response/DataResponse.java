package io.github.mpontoc.clean.architecture.application.entrypoint.model.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataResponse<T> {
    private T data;

    public DataResponse(T data) {
        this.data = data;
    }
}
