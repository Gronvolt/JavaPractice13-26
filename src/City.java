public class City {
    private String cityName;
    private String region;
    private String country;
    private String population;
    private String postCode;
    private String phoneCode;

    public City(String cityName, String region, String country, String population, String postCode, String phoneCode) {
        this.cityName = cityName;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postCode = postCode;
        this.phoneCode = phoneCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
