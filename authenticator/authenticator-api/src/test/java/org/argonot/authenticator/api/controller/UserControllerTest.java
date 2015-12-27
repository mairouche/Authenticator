package org.argonot.authenticator.api.controller;

import org.argonot.authenticator.api.utils.AbstractControllerTest;
import org.argonot.authenticator.api.vo.CredentialsVO;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserControllerTest extends AbstractControllerTest {
    
    private static final String SUBSCRIBER_EMAIL = "subscriber@gmail.com";
    private static final String SUBSCRIBER_NAME = "subscriberName";
    private static final String SUBSCRIBER_SURNAME = "subscriberSurname";
    private static final String USER_PASSWORD = "Test1.";
    private static final String AUID = "FRG";
    private static final String RUID = "USR";
    private static final String HTTP_POST_METHOD = "POST";
    private static final String SUBSCRIBE_ROUTE = "/users/subscribe";

    private static final ObjectMapper jsonMapper = new ObjectMapper();
    private static final CredentialsVO subscriberCredentials = new CredentialsVO();
    
    @Before
    public void setUpTests() {
        subscriberCredentials.setAuid(AUID);
        subscriberCredentials.setRuid(RUID);
        subscriberCredentials.setEmail(SUBSCRIBER_EMAIL);
        subscriberCredentials.setPassword(USER_PASSWORD);
        subscriberCredentials.setName(SUBSCRIBER_NAME);
        subscriberCredentials.setSurname(SUBSCRIBER_SURNAME);
    }

    @Test
    public void testSubscribeUser() throws Exception{
        this.request.setContent(jsonMapper.writeValueAsBytes(subscriberCredentials));
        this.testJsonObjectRoute(SUBSCRIBE_ROUTE, HTTP_POST_METHOD);
    }
}