import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class SquareTests {

   @Test
    fun testGetPoint1() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(3.0, 3.0)
        val square = Square(p1, p2)
        assertEquals(p1.getX(), square.getPoint1().getX())
        assertEquals(p1.getY(), square.getPoint1().getY())
    }

    @Test
    fun testGetPoint2() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(3.0, 3.0)
        val square = Square(p1, p2)
        assertEquals(p2.getX(), square.getPoint2().getX())
        assertEquals(p2.getY(), square.getPoint2().getY())
    }

    @Test
    fun testGetArea() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(3.0, 3.0)
        val square = Square(p1, p2)
        assertEquals(9.0, square.getArea())
    }

    @Test
    fun testMove() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(3.0, 3.0)
        val square = Square(p1, p2)
        square.move(1.0, 1.0)
        assertEquals(p1.getX(), square.getPoint1().getX())
        assertEquals(p1.getY(), square.getPoint1().getY())
        assertEquals(p2.getX(), square.getPoint2().getX())
        assertEquals(p2.getY(), square.getPoint2().getY())
    }

    @Test
    fun testZeroSquare() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(0.0, 3.0)
        assertFailsWith<IllegalArgumentException> {
            Square(p1, p2)
        }
    }
}
