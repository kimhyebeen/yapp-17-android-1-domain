import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Post {
    double lat, lon;
    String addr, contents, city;
    ArrayList<Photo> image;
    Date createDate;
    PostColor color;

    Post(double lat, double lon, String addr, Photo[] image, String city, PostColor color) {
        init(lat, lon, addr, city);
        this.image = new ArrayList<>();
        this.image.addAll(Arrays.asList(image));
        this.contents = null;
        this.color = color;
    }

    Post(double lat, double lon, String addr, String contents, String city, PostColor color) {
        init(lat, lon, addr, city);
        this.image = new ArrayList<>();
        this.contents = contents;
        this.color = color;
    }

    Post(double lat, double lon, String addr, Photo[] image, String contents, String city, PostColor color) {
        init(lat, lon, addr, city);
        this.image = new ArrayList<>();
        this.image.addAll(Arrays.asList(image));
        this.contents = contents;
        this.color = color;
    }

    public void init(double lat, double lon, String addr, String city) {
        this.lat = lat;
        this.lon = lon;
        this.addr = addr;
        this.city = city;
        this.createDate = new Date(System.currentTimeMillis()*1000);
    }

    public void addImage(Photo photo) {
        this.image.add(photo);
    }

    public void removeImage(Photo photo) {
        this.image.remove(photo);
    }

    public Photo getRandomImage() {
        if (image.size() == 0) return null;
        return image.get((int)(Math.random() * image.size()));
    }

    public int getImageSize() {
        if (image == null) return 0;
        else return image.size();
    }

    public void setColor(String color, String feels) {
        this.color = new PostColor(color, new Feel(feels));
    }

    public PostColor getColor() {
        return this.color;
    }
}
