import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PostColorTest extends Assert {
    private PostColor color;

    @Before
    public void init() {
        this.color = new PostColor("#ababab", new Feel("보통"));
    }

    @Test
    @DisplayName("컬러는 감정을 갖는다")
    public void testColor() {

        assertNotNull(this.color);
        assertNotNull(this.color.getFeel());
    }
}
