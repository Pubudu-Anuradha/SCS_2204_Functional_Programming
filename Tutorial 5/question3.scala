object question3 extends App {

  def sumUntilN(n: Int): Int = n match {
    case x if (x <= 0) => 0;
    case _             => n + sumUntilN(n - 1);
  };

  // For demonstration
  printf("Enter a number : ");
  var x = scala.io.StdIn.readInt();
  printf("Sum of natural numbers until %d is %d", x, sumUntilN(x));

}
