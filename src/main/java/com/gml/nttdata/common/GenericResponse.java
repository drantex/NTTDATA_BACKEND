package com.gml.nttdata.common;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class GenericResponse implements Serializable {
    private HttpStatus code = HttpStatus.OK;
    private String message;
    private Object object;
    private String error;
}
