object question5 extends App {

  def sumOfEvens(n: Int, i: Int = 2): Int = i match {
    case x if (x >= n) => 0;
    case _             => i + sumOfEvens(n, i + 2);
  }

  // For demonstration
  printf("Enter a number : ");
  var x = scala.io.StdIn.readInt();
  printf("Sum of even natural numbers until %d is %d", x, sumOfEvens(x));

}
