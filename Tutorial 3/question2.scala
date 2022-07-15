object question2 extends App {
  def celciusToFahrenheit(x: Double): Double = x * 1.8 + 32.0;

  val celcius: Double = 35.0;
  printf(
    "%.2f degrees celcius is %.2f degrees fahrenheit\n",
    celcius,
    celciusToFahrenheit(celcius)
  );
}
