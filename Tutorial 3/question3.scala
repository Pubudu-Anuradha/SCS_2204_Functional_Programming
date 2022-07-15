object question3 extends App {
  def volumeOfSphere(radius: Double): Double = {
    (4.0 / 3.0) * math.Pi * radius * radius * radius;
  }

  val radius: Double = 5.0;
  printf(
    "Volume of sphere with radius %.0f is %f\n",
    radius,
    volumeOfSphere(radius)
  );
}
