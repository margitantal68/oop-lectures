public class Pair implements Comparable<Pair>{
    private final String city;
    private final String country;

    public Pair(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return country+" : " + city;
    }

    @Override
    public int compareTo(Pair pair) {
        return this.country.compareTo( pair.country);
    }
}
