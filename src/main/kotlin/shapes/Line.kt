class Line(private val point1: Point, private val point2: Point) {

    init {
        if (point1 == point2) {
            throw IllegalArgumentException("A line cannot have zero length")
        }
    }

    fun getPoint1(): Point {
        return point1.clone()
    }

    fun getPoint2(): Point {
        return point2.clone()
    }

    fun getSlope(): Double {
        val deltaX = point2.getX() - point1.getX()
        val deltaY = point2.getY() - point1.getY()
        if (deltaX == 0.0) {
            throw IllegalArgumentException("Slope is undefined for vertical lines")
        }
        return deltaY / deltaX
    }

    fun getLength(): Double {
        val deltaX = point2.getX() - point1.getX()
        val deltaY = point2.getY() - point1.getY()
        return kotlin.math.sqrt(deltaX * deltaX + deltaY * deltaY)
    }

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}
