package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://api.beamable.com";
        
        configuration.api  = "YOUR API KEY";
        
        configuration.scope  = "YOUR API KEY";
        
        // Configure HTTP bearer authorization: user
        configuration.token = "BEARER TOKEN";
        
        configuration.userRequired  = "YOUR API KEY";
        Beamable client = new Beamable(configuration);
        assertNotNull(client);
    }
}
