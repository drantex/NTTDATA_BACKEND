package com.gml.nttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gml.nttdata.common.GenericResponse;
import com.gml.nttdata.common.HandlerException;
import com.gml.nttdata.services.IClient;

@RestController
@RequestMapping("/")
@Validated
public class ClientController {
    
    @Autowired
    private IClient clientService;

    @CrossOrigin(maxAge = 3600)
    @GetMapping("getClient/documentType/{documentType}/documentNumber/{documentNumber}")
    public ResponseEntity<GenericResponse> getClient(@PathVariable(required = true) Character documentType, @PathVariable(required = true) Integer documentNumber) throws HandlerException {
        GenericResponse response = new GenericResponse();

        if ( !documentType.equals('C') && !documentType.equals('P') ) {
            throw new HandlerException("DOCUMENT_TYPE_NOT_MACHT");
        }

        try {
            response.setObject( clientService.getClient(documentType, documentNumber) );
        } catch (HandlerException e) {
            response.setError( e.getMessage() );
            response.setCode( HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<GenericResponse>(response, response.getCode() );
    }
}