package com.gml.nttdata.services;

import com.gml.nttdata.common.HandlerException;
import com.gml.nttdata.entities.Client;

public interface IClient {
    public Client getClient( Character documenType, Integer documentNumber) throws HandlerException;
}
