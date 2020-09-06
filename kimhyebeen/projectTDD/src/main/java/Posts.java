import java.util.ArrayList;
import java.util.Arrays;

public class Posts {
    private ArrayList<Post> postList;

    Posts() {
        this.postList = new ArrayList<>();
    }

    Posts(Post... post) {
        this.postList = new ArrayList<>();
        this.postList.addAll(Arrays.asList(post));
    }

    public void addPost(Post post) {
        this.postList.add(post);
    }

    public void removePost(Post post) {
        this.postList.remove(post);
    }

    public ArrayList<Post> getPostList() {
        return this.postList;
    }

    public int getPostSize() {
        return this.postList.size();
    }
}
