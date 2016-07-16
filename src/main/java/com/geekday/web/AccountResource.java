package com.geekday.web;

import com.geekday.account.Account;
import com.geekday.account.AccountRepository;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/")
public class AccountResource {

    @GET
    @Path("account/{accountId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Account getAccount(@PathParam("accountId")String accountId) {
        return new AccountRepository().get(accountId);
    }
}