object question5 extends App {

  def sumOfEvens(n: Int): Int = n match {
    case x if (x <= 0)     => 0;
    case x if (x % 2 == 0) => n + sumOfEvens(n - 2);
    case _                 => sumOfEvens(n - 1);
  }

  // For demonstration
  printf("Enter a number : ");
  var x = scala.io.StdIn.readInt();
  printf("Sum of even natural numbers until %d is %d", x, sumOfEvens(x));

}
