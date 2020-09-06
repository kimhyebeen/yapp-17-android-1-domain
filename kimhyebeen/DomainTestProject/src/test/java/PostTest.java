import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class PostTest extends Assert {
    private Post pt;

    @Before
    public void init() {
        Photo[] photos = {new Photo("a"), new Photo("b"), new Photo("c")};
        pt = new Post(
                37.1234567,
                126.123456,
                "addr",
                photos,
                "contents",
                "city",
                new PostColor("#ffffff", new Feel("좋음"))
        );
    }

    @Test
    @DisplayName("위도는 소수점 6자리를 갖는다.")
    public void testLatitude() {
        double latResult = pt.lat - (int)pt.lat;

        assertTrue(latResult >= 0.000001);
    }

    @Test
    @DisplayName("경도는 소수점 7자리를 갖는다.")
    public void testLongitude() {
        double lonResult = pt.lon - (int)pt.lon;

        assertTrue(lonResult >= 0.0000001);
    }

    @Test
    @DisplayName("게시글 정보 조회 시 여러 개의 사진 url 중 랜덤으로 하나의 url이 출력된다.")
    public void testGetRandomImage() {

        if (pt.getImageSize()>0)
            assertNotNull(pt.getRandomImage());
        else assertNull(pt.getRandomImage());
    }

    @Test
    public void testCreatePost() {
        assertNotNull(pt);
        assertEquals(pt.lat, 37.1234567, 37.1234567);
        assertEquals(pt.lon, 126.123456, 126.123456);
        assertEquals(pt.addr, "addr");
        assertEquals(pt.contents, "contents");
        assertEquals(pt.city, "city");
    }

    @Test
    public void testChangeColor() {
        PostColor pc = pt.getColor();

        pt.setColor("#000000", "나쁨");

        assertNotNull(pc.getColors());
        assertNotEquals(pc, pt.getColor());
    }

    @Test
    @DisplayName("게시글의 사진을 추가/삭제할 수 있다.")
    public void testAddAndRemoveImage() {
        int size = pt.getImageSize();
        Photo p1 = new Photo("https://www.naver.com");

        assertTrue(size >= 0);

        pt.addImage(p1);
        assertEquals(pt.getImageSize(), size+1);

        pt.removeImage(p1);
        assertEquals(pt.getImageSize(), size);
    }
}