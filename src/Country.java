import java.util.Arrays;

public class Country {
    private String countryName;
    private String continentName;
    private String population;
    private String phoneCode;
    private String capital;
    private String[] cities;

    public Country(String countryName, String continentName, String population, String phoneCode, String capital, String[] cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCities() {
        return Arrays.toString(cities);
    }

    public void setCities(String[] cities) {
        this.cities = cities;
    }
}
