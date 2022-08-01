object question3Alt extends App {

  /* Assuming the given output needs to be replicated exactly as,
   *
   * BENNY
   * NIroshan
   * saman
   * KumarA
   *
   * made another function to capitalize one letter by index.
   */

  // index is ignored in these
  def toUpper(s: String, index: Int = 0): String = s.toUpperCase();
  def toLower(s: String, index: Int = 0): String = s.toLowerCase();

  def capitalizeIndex(s: String, index: Int): String = {
    var chars: Array[Char] = s.toCharArray()
    for (i <- 0 to chars.length - 1) {
      chars(i) =
        if (chars(i) >= 'a' && chars(i) <= 'z' && i == index) chars(i).toUpper
        else chars(i)
    }
    String(chars)
  }

  def formatNames(name: String, format: (String, Int) => String, index: Int) =
    format(name, index);

  val testInputs: Array[Tuple3[String, (String, Int) => String, Int]] =
    Array(
      ("Benny", toUpper, 0),
      ("Niroshan", capitalizeIndex, 1),
      ("Saman", toLower, 0),
      ("Kumara", capitalizeIndex, 5)
    )

  for (i <- testInputs) {
    printf("%s\n", formatNames(i._1, i._2, i._3));
  }
}
