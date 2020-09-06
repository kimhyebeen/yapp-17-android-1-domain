import java.util.ArrayList;
import java.util.Date;

public class Post {
    private Coordinate coordinate;
    private ArrayList<PostImage> imageList;
    private String content;
    private Date createDate;

    Post(Coordinate coordinate, String content) {
        this.coordinate = coordinate;
        this.imageList = new ArrayList<>();
        this.content = content;
        this.createDate = new Date(System.currentTimeMillis());
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
