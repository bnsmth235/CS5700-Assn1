open class Ellipse(private val center: Point, private val radiusX: Double, private val radiusY: Double) {

    init {
        if (radiusX <= 0 || radiusY <= 0) {
            throw IllegalArgumentException("Radii must be positive values")
        }
    }

    fun getCenter(): Point {
        return center.clone()
    }

    fun getRadiusX(): Double {
        return radiusX
    }

    fun getRadiusY(): Double {
        return radiusY
    }

    fun getArea(): Double {
        return Math.PI * radiusX * radiusY
    }

    fun move(deltaX: Double, deltaY: Double) {
        center.move(deltaX, deltaY)
    }
}
