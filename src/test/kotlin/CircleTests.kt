import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CircleTests {

    @Test
    fun testGetCenter() {
        val center = Point(1.0, 1.0)
        val circle = Circle(center, 2.0)
        assertEquals(center.getX(), circle.getCenter().getX())
        assertEquals(center.getY(), circle.getCenter().getY())
    }

    @Test
    fun testGetRadius() {
        val center = Point(1.0, 1.0)
        val circle = Circle(center, 2.0)
        assertEquals(2.0, circle.getRadiusX())
        assertEquals(2.0, circle.getRadiusY())
    }

    @Test
    fun testGetArea() {
        val center = Point(1.0, 1.0)
        val circle = Circle(center, 2.0)
        assertEquals(Math.PI * 2.0 * 2.0, circle.getArea())
    }

    @Test
    fun testMove() {
        val center = Point(1.0, 1.0)
        val circle = Circle(center, 2.0)
        circle.move(1.0, 1.0)
        assertEquals(2.0, circle.getCenter().getX())
        assertEquals(2.0, circle.getCenter().getY())
    }

    @Test
    fun testZeroRadiusCircle() {
        val center = Point(1.0, 1.0)
        assertFailsWith<IllegalArgumentException> {
            Circle(center, 0.0)
        }
    }
}
