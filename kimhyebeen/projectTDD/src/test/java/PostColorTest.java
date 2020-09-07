import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PostColorTest {
    private PostColor postColor = new PostColor(Colors.Blue, new Emotion("좋음"));

    @Test
    void getColors() {
        assertNotNull(postColor);
        assertNotNull(postColor.getColors());
    }

    @Test
    void getEmotion() {
        assertNotNull(postColor.getEmotion());
    }

    @Test
    void setColors() {
        assertNotNull(postColor);
        postColor.setColors(Colors.Red);
        assertEquals(postColor.getColors(), Colors.Red);
    }

    @Test
    void setEmotion() {
        assertNotNull(postColor);
        postColor.setEmotion(new Emotion("나쁨"));
        assertEquals(postColor.getEmotion().getFeel(), "나쁨");
    }
}