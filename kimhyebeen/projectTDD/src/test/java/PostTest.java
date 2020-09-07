import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {
    private Post post =
            new Post(new Coordinate(37.124123, 127.1234123), "내용");

    @Test
    void addImage() {
        assertNotNull(post);

        int beforeSize = post.getImageSize();
        post.addImage(new PostImage("url1"), new PostImage("url2"));
        int afterSize = post.getImageSize();

        assertTrue(beforeSize < afterSize);
    }

    @Test
    void getRandomImage() {
        assertTrue(post.imageList.contains(post.getRandomImage()));
    }

    @Test
    void getContent() {
        assertNotNull(post.getContent());
    }

    @Test
    void getCreateDate() {
        assertNotNull(post.getCreateDate());
    }

    @Test
    void setContent() {
        String beforeContents = post.getContent();
        post.setContent("내용22");
        String afterContents = post.getContent();

        assertNotEquals(beforeContents, afterContents);
        assertEquals(afterContents, "내용22");
    }
}