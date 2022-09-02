package com.gml.nttdata.common;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<GenericResponse> errorHandler (Exception ex){
        GenericResponse response = new GenericResponse();
        response.setCode( HttpStatus.BAD_REQUEST );
        response.setError(  ex.getMessage() );
        
        return new ResponseEntity<GenericResponse>( response, HttpStatus.BAD_REQUEST );
    }

}
