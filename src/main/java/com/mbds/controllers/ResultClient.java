package com.mbds.controllers;

import com.mbds.metier.Client;

public final class ResultClient{
    private final EnumTypeEcran typeEcran;
    private final Client leClient;

    public ResultClient(EnumTypeEcran typeEcran, Client leClient) {
        this.typeEcran = typeEcran;
        this.leClient = leClient;
    }

    public EnumTypeEcran getTypeEcran() {
        return typeEcran;
    }

    public Client getClient() {
        return leClient;
    }
}