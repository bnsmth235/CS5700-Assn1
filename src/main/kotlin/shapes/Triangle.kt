class Triangle(private val point1: Point, private val point2: Point, private val point3: Point) {

    init {
        val area = getArea()
        if (area == 0.0) {
            throw IllegalArgumentException("A triangle cannot have zero area")
        }
    }

    fun getPoint1(): Point {
        return point1.clone()
    }

    fun getPoint2(): Point {
        return point2.clone()
    }

    fun getPoint3(): Point {
        return point3.clone()
    }

    fun getArea(): Double {
        val x1 = point1.getX()
        val y1 = point1.getY()
        val x2 = point2.getX()
        val y2 = point2.getY()
        val x3 = point3.getX()
        val y3 = point3.getY()

        return kotlin.math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0)
    }

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
        point3.move(deltaX, deltaY)
    }
}
