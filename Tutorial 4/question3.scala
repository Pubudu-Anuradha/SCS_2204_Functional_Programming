object question3 extends App {
  def toUpper(s: String): String = s.toUpperCase();
  def toLower(s: String): String = s.toLowerCase();

  def formatNames(name: String, format: (String) => String) = format(name);

  val testInputs: Array[Tuple2[String, (String) => String]] =
    Array(
      ("Benny", toUpper),
      ("Niroshan", toUpper),
      ("Saman", toLower),
      ("Kumara", toUpper)
    )

  for (i <- testInputs) {
    printf("%s\n", formatNames(i._1, i._2));
  }
}
