package dao;

import domain.Country;

import java.sql.SQLException;
import java.util.List;

public interface CountryDAO {
    List<Country> getAllCountries() throws SQLException;
    Country getCountryByName(String getCountryWithName) throws SQLException;
    boolean insertCountry(Country country)throws SQLException;
    boolean updateCountry(Country country)throws SQLException;
}
