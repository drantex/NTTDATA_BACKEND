package com.gml.nttdata.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gml.nttdata.common.HandlerException;
import com.gml.nttdata.daos.ClientDao;
import com.gml.nttdata.entities.Client;
import com.gml.nttdata.services.IClient;

@Service
public class ClientImpl implements IClient {

    @Autowired
    private ClientDao clientDao;

    @Override
    public Client getClient(Character documenType, Integer documentNumber) throws HandlerException {
        return clientDao.findByDocumenTypeAndDocumentNumber(documenType, documentNumber).orElseThrow( ()-> new HandlerException("CLIENT_NOT_FOUND"));
    }
    
}
