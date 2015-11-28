package org.argonot.authenticator.api.controller;

import static org.junit.Assert.assertTrue;

import org.argonot.authenticator.api.utils.AbstractControllerTest;
import org.argonot.authenticator.api.vo.CredentialsVO;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthenticatorControllerTest extends AbstractControllerTest {
    
    private static final String USER_PASSWORD = "Test1.";
    private static final String USER_EMAIL = "meidi.airouche@gmail.com";
    private static final String LOCKED_USER_EMAIL = "meidi.airouche@gmail.com";
    private static final String APP_ID = "FRG";
    private static final String HTTP_POST_METHOD = "POST";
    private static final String AUTHENTICATION_ROUTE = "/authenticator/authenticate/user";
    private static final String SECURE_AUTHENTICATION_ROUTE = "/authenticator/secure/authenticate/user";
    private static final String ADMIN_CHECK_ACCOUNT_ROUTE = "/authenticator/admin/user/account/status";
    private static final String JSON_CONTENT_TYPE = "application/json";
    private static final ObjectMapper jsonMapper = new ObjectMapper();
    
    private static final CredentialsVO credentials = new CredentialsVO();
    
    @Before
    public void setUpTest() {
        credentials.setAuid(APP_ID);
        credentials.setEmail(USER_EMAIL);
        credentials.setPassword(USER_PASSWORD);
    }

    @Test
    public void testAuthenticateUser() throws Exception {
        this.request.setContent(jsonMapper.writeValueAsBytes(credentials));
        this.testJsonObjectRoute(AUTHENTICATION_ROUTE, HTTP_POST_METHOD);
    }
    
    @Test
    public void testSecureAuthenticateUser() throws Exception {
        this.request.setContent(jsonMapper.writeValueAsBytes(credentials));
        this.testJsonObjectRoute(SECURE_AUTHENTICATION_ROUTE, HTTP_POST_METHOD);
    }
    
    @Test
    public void testCheckUserAccountLock() throws Exception {
        credentials.setEmail(LOCKED_USER_EMAIL);
        this.request.setContent(jsonMapper.writeValueAsBytes(credentials));
        request.setRequestURI(ADMIN_CHECK_ACCOUNT_ROUTE);
        request.setMethod(HTTP_POST_METHOD);
        request.setContentType(JSON_CONTENT_TYPE);
        Object handler = handlerMapping.getHandler(request).getHandler();
        handlerAdapter.handle(request, response, handler);
        assertTrue("false".equals(response.getContentAsString()));
    }
}
