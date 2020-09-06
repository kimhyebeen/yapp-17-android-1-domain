import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordinateTest {
    private final Coordinate coordinate = new Coordinate(37.123412, 127.1234123);

    @Test
    void createCoordinate() {
        assertNotNull(this.coordinate);
    }

    @Test
    void getAddress() {
        // TODO("00도 00시"의 규격에 맞는 정규표현식 비교)
    }
}