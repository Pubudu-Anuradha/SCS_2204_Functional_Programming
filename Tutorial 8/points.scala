case class Point(x: Double, y: Double) {
  def +(that: Point): Point = new Point(this.x + that.x, this.y + that.y);

  def move(dx: Double, dy: Double): Point = new Point(this.x + dx, this.y + dy)

  def distance(dest: Point): Double = math.sqrt(
    ((this.x - dest.x) * (this.x - dest.x) + (this.y - dest.y) * (this.y - dest.y))
  )

  def invert(): Point = Point(y, x);
}

object points extends App {
  println("Initializing the point 3,4")
  var point1: Point = Point(3.0, 4.0);
  println(point1);
  println("Getting a new point by moving point 1 by dx = -3 and dy = -4 => 0,0")
  var point2 = point1.move(-3.0, -4.0)
  println(point2);
  println(s"Distance between point1 and point2 = ${point1.distance(point2)}")
  println("Getting a new point by inverting point1");
  var point3 = point1.invert();
  println(point3);
  println(s"Distance between point1 and point3 = ${point1.distance(point3)}")
  println(s"Distance between point2 and point3 = ${point2.distance(point3)}")
  println("Adding point1 and point3");
  var point4 = point1 + point3;
  println(point4)
}
