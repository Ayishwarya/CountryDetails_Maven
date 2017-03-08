package service;

import dao.CountryDaoImpl;
import domain.Country;

import java.sql.SQLException;
import java.util.List;

public class CountryService {
    private CountryDaoImpl countryDAOImpl;

    public CountryService() throws Exception {
        countryDAOImpl = new CountryDaoImpl();
    }

    public StringBuffer getCountries() throws SQLException {
        List<Country> countries = countryDAOImpl.getAllCountries();
        StringBuffer stringBuilder = new StringBuffer();
        for (Country c:countries){
            stringBuilder.append(c.toString());
        }
        return stringBuilder;
    }
}
