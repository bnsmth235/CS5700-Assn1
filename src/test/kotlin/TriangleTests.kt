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
        assertEquals(p1, triangle.getPoint1())
    }

    @Test
    fun testGetPoint2() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val triangle = Triangle(p1, p2, p3)
        assertEquals(p2, triangle.getPoint2())
    }

    @Test
    fun testGetPoint3() {
        val p1 = Point(0.0, 0.0)
        val p2 = Point(1.0, 0.0)
        val p3 = Point(0.0, 1.0)
        val triangle = Triangle(p1, p2, p3)
        assertEquals(p3, triangle.getPoint3())
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
        assertEquals(Point(1.0, 1.0), triangle.getPoint1())
        assertEquals(Point(2.0, 1.0), triangle.getPoint2())
        assertEquals(Point(1.0, 2.0), triangle.getPoint3())
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
