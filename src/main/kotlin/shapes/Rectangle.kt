open class Rectangle(private val point1: Point, private val point2: Point) {

    init {
        if (point1.getX() == point2.getX() || point1.getY() == point2.getY()) {
            throw IllegalArgumentException("A rectangle cannot have zero width or height")
        }
    }

    fun getPoint1(): Point {
        return point1.clone()
    }

    fun getPoint2(): Point {
        return point2.clone()
    }

    fun getArea(): Double {
        val width = kotlin.math.abs(point2.getX() - point1.getX())
        val height = kotlin.math.abs(point2.getY() - point1.getY())
        return width * height
    }

    fun move(deltaX: Double, deltaY: Double) {
        point1.move(deltaX, deltaY)
        point2.move(deltaX, deltaY)
    }
}
