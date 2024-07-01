import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class LineTests {

    @Test
    fun testGetPoint1() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 1.0)
        val line = Line(p1, p2)
        assertEquals(p1.getX(), line.getPoint1().getX())
        assertEquals(p1.getY(), line.getPoint1().getY())
    }

    @Test
    fun testGetPoint2() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 1.0)
        val line = Line(p1, p2)
        assertEquals(p2.getX(), line.getPoint2().getY())
        assertEquals(p2.getY(), line.getPoint2().getY())
    }

    @Test
    fun testGetSlope() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(2.0, 2.0)
        val line = Line(p1, p2)
        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun testGetLength() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(3.0, 4.0)
        val line = Line(p1, p2)
        assertEquals(5.0, line.getLength())
    }

    @Test
    fun testMove() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 1.0)
        val line = Line(p1, p2)
        line.move(2.0, 2.0)
        assertEquals(2.0, line.getPoint1().getX())
        assertEquals(2.0, line.getPoint1().getY())
        assertEquals(3.0, line.getPoint2().getX())
        assertEquals(3.0, line.getPoint2().getY())
    }

    @Test
    fun testZeroLengthLine() {
        val p1 = Point(0.0, 0.0)
        assertFailsWith<IllegalArgumentException> {
            Line(p1, p1)
        }
    }
}
