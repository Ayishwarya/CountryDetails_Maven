package dao;

import domain.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class CountryDaoImpl implements CountryDAO {
    private Connection conn;
    private List<Country> countries = new ArrayList<Country>();

    public CountryDaoImpl() throws Exception {
        Class.forName("org.postgresql.Driver");
        conn = getConnection("jdbc:postgresql://localhost:5432/country",
                "postgres", "@Yishwarya2510");
    }

    @Override
    public List<Country> getAllCountries() throws SQLException {
        Statement statement = conn.createStatement();
        String s = "SELECT * FROM country";
        ResultSet rs = statement.executeQuery(s);
        while (rs.next()) {
            Country country = new Country();
            country.setName(rs.getString("Name"));
            country.setPopulation(rs.getDouble("Population"));
            country.setNational_Language(rs.getString("National_Language"));
            country.setContinent(rs.getString("Continent"));
            country.setEconomic_Drivers(rs.getString("Economic_Drivers"));
            country.setCurrency(rs.getString("Currency"));
            country.setExchange_Rate(rs.getDouble("Exchange_Rate"));
            country.setPlaces_To_Visit(rs.getString("Places_To_Visit"));
            country.setClimatic_Conditions(rs.getString("Climatic_Conditions"));
            countries.add(country);
        }
        rs.close();
        return countries;
    }

    @Override
    public Country getCountryByName(String countryName)throws SQLException {
        for(Country country : countries){
            if(country.getName() != null && country.getName().equals(countryName)){
                return country;
            }
        }
        throw new SQLException("domain.Country not present");
    }

    @Override
    public boolean insertCountry(Country country) throws SQLException {
        String sql = "INSERT INTO country (Name,Population,National_Language,Continent,Economic_Drivers,Currency,Exchange_Rate,Places_To_Visit,Capital,Climatic_Conditions) VALUES " + "(" + country.getName() + "," + country.getPopulation() + "," + country.getNational_Language() + "," + country.getContinent() + "," + country.getEconomic_Drivers() + "," + country.getCurrency() + "," + country.getExchange_Rate() + "," + country.getPlaces_To_Visit() + "," + country.getCapital() + "," + country.getClimatic_Conditions() + ");";
        PreparedStatement statement = conn.prepareStatement(sql);
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("domain.Country info added successfully!");
            countries.add(country);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCountry(Country country) throws SQLException {
        String sql = "UPDATE country SET Population=" + country.getPopulation() + ",National_Language=" + country.getNational_Language() + ",Continent=" + country.getContinent() + ",Economic_Drivers=" + country.getEconomic_Drivers() + ",Currency=" + country.getCurrency() + ",Exchange_Rate=" + country.getExchange_Rate() + ",Places_To_Visit=" + country.getPlaces_To_Visit() + ",Capital=" + country.getCapital() + ",Climatic_Conditions=" + country.getClimatic_Conditions() + " WHERE Name=" + country.getName() + ";";
        PreparedStatement statement = null;
        try {
            statement = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("domain.Country info updated successfully!");
            countries.add(country);
            return true;
        }
        return false;
    }


}

