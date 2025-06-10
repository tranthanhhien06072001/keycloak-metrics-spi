package org.jboss.aerogear.keycloak.metrics;

import java.util.HashMap;
import java.util.Map;

public class URLMapping {

    public static Map<String, String> getData() {

        Map<String, String> urlMappings = new HashMap<>();
        urlMappings.put("/realms/.{1,255}/login-actions/authenticate", "authenticate");
        urlMappings.put("/realms/.{1,255}/login-actions/registration", "registration");
        urlMappings.put("/realms/.{1,255}/account/password", "password");
        urlMappings.put("/realms/.{1,255}/protocol/openid-connect/logout", "logout");

        return urlMappings;
    }
}
