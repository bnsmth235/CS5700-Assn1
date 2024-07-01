import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class RectangleTests {

    @Test
    fun testGetPoint1() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 3.0)
        val rect = Rectangle(p1, p2)
        assertEquals(p1.getX(), rect.getPoint1().getX())
        assertEquals(p1.getY(), rect.getPoint1().getY())
    }

    @Test
    fun testGetPoint2() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 3.0)
        val rect = Rectangle(p1, p2)
        assertEquals(p2.getX(), rect.getPoint2().getX())
        assertEquals(p2.getY(), rect.getPoint2().getY())
    }

    @Test
    fun testGetArea() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 3.0)
        val rect = Rectangle(p1, p2)
        assertEquals(6.0, rect.getArea())
    }

    @Test
    fun testMove() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 3.0)
        val rect = Rectangle(p1, p2)
        rect.move(1.0, 1.0)
        assertEquals(p1.getX(), rect.getPoint1().getX())
        assertEquals(p1.getY(), rect.getPoint1().getY())
        assertEquals(p2.getX(), rect.getPoint2().getX())
        assertEquals(p2.getY(), rect.getPoint2().getY())
    }

    @Test
    fun testZeroWidthHeightRectangle() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(0.0, 3.0)
        assertFailsWith<IllegalArgumentException> {
            Rectangle(p1, p2)
        }
    }
}
