import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PhotoTest extends Assert {
    @Test
    @DisplayName("사진은 url을 가지고 있다.")
    public void testCreatePhoto() {
        Photo pt = new Photo("aaaa");

        assertNotNull(pt);
        assertEquals(pt.url, "aaaa");
    }
}
