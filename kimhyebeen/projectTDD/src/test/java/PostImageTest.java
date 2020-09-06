import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostImageTest {
    private final PostImage postImage = new PostImage("asdf");

    @Test
    void getUrl() {
        assertNotNull(postImage);
        assertNotNull(postImage.getUrl());
    }
}