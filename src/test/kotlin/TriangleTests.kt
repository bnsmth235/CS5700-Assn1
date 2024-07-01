import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class TriangleTest {

    @Test
    fun testGetPoint1() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val triangle = Triangle(p1, p2, p3)
        assertEquals(p1.getX(), triangle.getPoint1().getX())
        assertEquals(p1.getY(), triangle.getPoint1().getY())
    }

    @Test
    fun testGetPoint2() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val triangle = Triangle(p1, p2, p3)
        assertEquals(p2.getX(), triangle.getPoint2().getX())
        assertEquals(p2.getY(), triangle.getPoint2().getY())
    }

    @Test
    fun testGetPoint3() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val triangle = Triangle(p1, p2, p3)
        assertEquals(p3.getX(), triangle.getPoint3().getX())
        assertEquals(p3.getY(), triangle.getPoint3().getY())
    }

    @Test
    fun testGetArea() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val triangle = Triangle(p1, p2, p3)
        assertEquals(0.5, triangle.getArea())
    }

    @Test
    fun testMove() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val triangle = Triangle(p1, p2, p3)
        triangle.move(1.0, 1.0)
        assertEquals(1.0, triangle.getPoint1().getX())
        assertEquals(1.0, triangle.getPoint1().getY())
        assertEquals(2.0, triangle.getPoint2().getX())
        assertEquals(1.0, triangle.getPoint2().getY())
        assertEquals(1.0, triangle.getPoint3().getX())
        assertEquals(2.0, triangle.getPoint3().getY())
    }

    @Test
    fun testZeroAreaTriangle() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 1.0)
        val p3 = Point(2.0, 2.0)
        assertFailsWith<IllegalArgumentException> {
            Triangle(p1, p2, p3)
        }
    }
}
