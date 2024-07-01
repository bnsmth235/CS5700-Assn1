class Point(private var x: Double, private var y: Double) {

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun clone(): Point {
        return Point(x, y)
    }

    fun move(deltaX: Double, deltaY: Double) {
        x += deltaX
        y += deltaY
    }
}
