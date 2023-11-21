package com.pz.frontend.rest;

import com.pz.frontend.dto.OperatorCredentialsDto;
import com.pz.frontend.handler.AuthenticationResultHandler;

public interface Authenticator {

    void authenticate(OperatorCredentialsDto operatorCredentialsDto, AuthenticationResultHandler authenticationResultHandler);

}
