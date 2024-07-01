import kotlin.test.Test
import kotlin.test.assertEquals

class PointTests {

    @Test
    fun testGetX() {
        val point = Point(1.0, 2.0)
        assertEquals(1.0, point.getX())
    }

    @Test
    fun testGetY() {
        val point = Point(1.0, 2.0)
        assertEquals(2.0, point.getY())
    }

    @Test
    fun testClone() {
        val point = Point(1.0, 2.0)
        val clone = point.clone()
        assertEquals(point.getX(), clone.getX())
        assertEquals(point.getY(), clone.getY())
    }

    @Test
    fun testMove() {
        val point = Point(1.0, 2.0)
        point.move(3.0, 4.0)
        assertEquals(4.0, point.getX())
        assertEquals(6.0, point.getY())
    }
}
