/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author azar
 */
@Path("apitest")
public class TestREST {

    @GET
    @Path("/test")
    @Produces({MediaType.TEXT_PLAIN})
    public String getResponse() {
        return "Haaaai....";
    }
}
