import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PostsTest {
    private Posts posts = new Posts(
        new Post(new Coordinate(37.123412, 127.1234122), "a"),
        new Post(new Coordinate(37.123412, 127.1234122), "b")
    );

    @Test
    void createPosts() {
        assertNotNull(this.posts);
    }

    @Test
    @DisplayName("Post를 추가할 수 있다")
    void addPost() {
        this.posts.addPost(
            new Post(new Coordinate(37.123412, 127.1234122), "c")
        );
        int beforeSize = this.posts.getPostSize();

        this.posts.addPost(
            new Post(new Coordinate(37.123412, 127.1234122), "d")
        );
        int afterSize = this.posts.getPostSize();

        assertNotEquals(beforeSize, afterSize);
        assertTrue(beforeSize < afterSize);
    }

    @Test
    @DisplayName("Post를 삭제할 수 있다")
    void removePost() {
        int beforeSize = this.posts.getPostSize();

        this.posts.removePost(
            new Post(new Coordinate(37.123412, 127.1234122), "b")
        );
        int afterSize = this.posts.getPostSize();

        assertNotEquals(beforeSize, afterSize);
        assertTrue(beforeSize > afterSize);
    }

    @Test
    @DisplayName("Post를 조회할 수 있다")
    void getPostList() {
        int originalSize = this.posts.getPostSize();
        ArrayList<Post> list = this.posts.getPostList();
        int cloneSize = list.size();

        assertNotNull(list);
        assertEquals(originalSize, cloneSize);
    }
}