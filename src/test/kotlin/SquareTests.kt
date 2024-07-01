import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class SquareTests {

    @Test
    fun testGetPoint1() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 2.0)
        val square = Square(p1, p2)
        assertEquals(p1, square.getPoint1())
    }

    @Test
    fun testGetPoint2() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 2.0)
        val square = Square(p1, p2)
        assertEquals(p2, square.getPoint2())
    }

    @Test
    fun testGetArea() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 2.0)
        val square = Square(p1, p2)
        assertEquals(4.0, square.getArea())
    }

    @Test
    fun testMove() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 2.0)
        val square = Square(p1, p2)
        square.move(1.0, 1.0)
        assertEquals(Point(1.0, 1.0), square.getPoint1())
        assertEquals(Point(3.0, 3.0), square.getPoint2())
    }

    @Test
    fun testNonSquare() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 3.0)
        assertFailsWith<IllegalArgumentException> {
            Square(p1, p2)
        }
    }
}
