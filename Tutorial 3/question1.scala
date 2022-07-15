object question1 extends App {
  def areaOfDisk(radius: Double): Double = {
    math.Pi * radius * radius;
  }
  val radius: Double = 5.0;
  printf("Area of disk with radius %.0f is %f\n", radius, areaOfDisk(radius));
}
