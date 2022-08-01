object question1 extends App {

  def interest(deposit: Double): Double = {
    deposit match {
      case x if x <= 20000.0   => deposit * .02;
      case x if x <= 200000.0  => deposit * .04;
      case x if x <= 2000000.0 => deposit * .35;
      case _                   => deposit * .65;
    }
  }

  // Demonstration
  printf("Enter your deposit amount : ");
  var amount: Double = scala.io.StdIn.readDouble();
  printf(
    "%.2f will generate an interest of %.2f per year\n",
    amount,
    interest(amount)
  );
}
