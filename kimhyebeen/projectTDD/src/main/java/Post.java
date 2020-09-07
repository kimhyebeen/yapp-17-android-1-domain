import org.jeasy.random.EasyRandom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Post {
    private Coordinate coordinate;
    ArrayList<PostImage> imageList;
    private String content;
    private Date createDate;

    Post(Coordinate coordinate, String content) {
        this.coordinate = coordinate;
        this.imageList = new ArrayList<>();
        this.content = content;
        this.createDate = new Date(System.currentTimeMillis());
    }

    public void addImage(PostImage... postImage) {
        this.imageList.addAll(Arrays.asList(postImage));
    }

    public PostImage getRandomImage() {
        return imageList.get(new Random().nextInt(imageList.size()));
    }

    public String getContent() {
        return content;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public int getImageSize() {
        return this.imageList.size();
    }

    public void setContent(String content) {
        this.content = content;
    }
}
