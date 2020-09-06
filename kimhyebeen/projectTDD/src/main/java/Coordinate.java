public class Coordinate {
    private final double lat;
    private final double lng;
    private final String address;

    Coordinate (double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
        this.address = "";
    }

    public double getLatitude() {
        return this.lat;
    }

    public double getLongitude() {
        return this.lng;
    }

    public String getAddress() {
        return this.address;
    }
}
