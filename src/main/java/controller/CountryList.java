package controller;

import service.CountryService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.sql.SQLException;

@Path("/")
public class CountryList {
    private CountryService countryService;

    public CountryList() throws Exception {
        countryService = new CountryService();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getAllCountries() throws SQLException {
        return countryService.getCountries().toString();
    }
}
