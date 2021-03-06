package com.mastercard.masterpass.test.merchant.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mastercard.masterpass.test.merchant.controllers.SessionKeySigningController;
import com.mastercard.masterpass.test.merchant.messages.json.SessionKeySigningRequest;
import com.mastercard.masterpass.test.merchant.messages.json.SessionKeySigningResponse;
import com.mastercard.masterpass.test.merchant.util.Config;
import com.mastercard.masterpass.test.merchant.util.RestOpenAPIService;

@Path("/sessionKeySigning")
public class SessionKeySigningService {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public SessionKeySigningResponse getSessionKeySigningResponse(SessionKeySigningRequest sessionKeySigningRequest) {
        // Delegate action to controller
        return new SessionKeySigningController(new Config(), new RestOpenAPIService()).getSessionKeySigning(sessionKeySigningRequest);
    }

}
