package domain;

public class Country {
    private String name;
    private double population;
    private String national_Language;
    private String continent;
    private String economic_Drivers;
    private String currency;
    private double exchange_Rate;
    private String places_To_Visit;
    private String capital;
    private String climatic_Conditions;

    public Country(String name, double population, String national_Language, String continent, String economic_Drivers, String currency, double exchange_Rate, String places_To_Visit, String capital, String climatic_Conditions) {
        this.name=name;
        this.population = population;
        this.national_Language = national_Language;
        this.continent = continent;
        this.economic_Drivers = economic_Drivers;
        this.currency = currency;
        this.exchange_Rate = exchange_Rate;
        this.places_To_Visit = places_To_Visit;
        this.capital = capital;
        this.climatic_Conditions = climatic_Conditions;
    }

    public Country() {

    }

    public String getName() {
        return name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getNational_Language() {
        return national_Language;
    }

    public void setNational_Language(String national_Language) {
        this.national_Language = national_Language;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getEconomic_Drivers() {
        return economic_Drivers;
    }

    public void setEconomic_Drivers(String economic_Drivers) {
        this.economic_Drivers = economic_Drivers;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getExchange_Rate() {
        return exchange_Rate;
    }

    public void setExchange_Rate(double exchange_Rate) {
        this.exchange_Rate = exchange_Rate;
    }

    public String getPlaces_To_Visit() {
        return places_To_Visit;
    }

    public void setPlaces_To_Visit(String places_To_Visit) {
        this.places_To_Visit = places_To_Visit;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getClimatic_Conditions() {
        return climatic_Conditions;
    }

    public void setClimatic_Conditions(String climatic_Conditions) {
        this.climatic_Conditions = climatic_Conditions;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", national_Language='" + national_Language + '\'' +
                ", continent='" + continent + '\'' +
                ", economic_Drivers='" + economic_Drivers + '\'' +
                ", currency='" + currency + '\'' +
                ", exchange_Rate=" + exchange_Rate +
                ", places_To_Visit='" + places_To_Visit + '\'' +
                ", capital='" + capital + '\'' +
                ", climatic_Conditions='" + climatic_Conditions + '\'' +
                '}';
    }
}
