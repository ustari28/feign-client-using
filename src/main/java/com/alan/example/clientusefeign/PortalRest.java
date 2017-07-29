package com.alan.example.clientusefeign;

import com.alan.feign.client.ClienteDTO;
import com.alan.feign.client.IClientRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alan Dávila<br>
 *         27 Jul. 2017 23:10
 */
@RestController
@RequestMapping("/portal")
public class PortalRest {

    /**
     * Feign client.
     */
    @Autowired
    private IClientRest clientRest;

    /**
     * Simple rest service that uses Feign interface for communication with another micro-service.
     *
     * @return
     */
    @RequestMapping(value = "/something", method = RequestMethod.GET)
    public ResponseEntity<ClienteDTO> getPortal() {
        return new ResponseEntity<ClienteDTO>(clientRest.get("TESTS1111").getBody(), HttpStatus.OK);
    }
}
