class Square(point1: Point, point2: Point) : Rectangle(point1, point2) {

    init {
        val width = kotlin.math.abs(point2.getX() - point1.getX())
        val height = kotlin.math.abs(point2.getY() - point1.getY())
        if (width != height) {
            throw IllegalArgumentException("A square must have equal width and height")
        }
    }
}
