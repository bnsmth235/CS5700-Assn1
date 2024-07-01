import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class EllipseTests {

    @Test
    fun testGetCenter() {
        val center = Point(1.0, 1.0)
        val ellipse = Ellipse(center, 1.0, 1.0)
        assertEquals(center.getX(), ellipse.getCenter().getX())
        assertEquals(center.getY(), ellipse.getCenter().getY())
    }

    @Test
    fun testGetRadiusX() {
        val center = Point(1.0, 1.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        assertEquals(2.0, ellipse.getRadiusX())
    }

    @Test
    fun testGetRadiusY() {
        val center = Point(1.0, 1.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        assertEquals(3.0, ellipse.getRadiusY())
    }

    @Test
    fun testGetArea() {
        val center = Point(1.0, 1.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        assertEquals(Math.PI * 2.0 * 3.0, ellipse.getArea())
    }

    @Test
    fun testMove() {
        val center = Point(1.0, 1.0)
        val ellipse = Ellipse(center, 2.0, 3.0)
        ellipse.move(1.0, 1.0)
        assertEquals(Point(2.0, 2.0).getX(), ellipse.getCenter().getX())
        assertEquals(Point(2.0, 2.0).getY(), ellipse.getCenter().getY())
    }

    @Test
    fun testZeroRadiiEllipse() {
        val center = Point(1.0, 1.0)
        assertFailsWith<IllegalArgumentException> {
            Ellipse(center, 0.0, 3.0)
        }
    }
}
