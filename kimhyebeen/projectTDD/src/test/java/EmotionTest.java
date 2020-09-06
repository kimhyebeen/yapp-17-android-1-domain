import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmotionTest {
    private final Emotion emotion = new Emotion("좋음");

    @Test
    void getFeel() {
        assertNotNull(emotion);
        assertNotNull(emotion.getFeel());
    }
}