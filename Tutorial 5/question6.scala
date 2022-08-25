object question6 extends App {

  def fibonacci(n: Int): Int = n match {
    case x if (x <= 1) => n;
    case _             => fibonacci(n - 1) + fibonacci(n - 2);
  }

  def fibonacciUntilN(n: Int): Any = n match {
    case x if (x < 0) => return;
    case _ => {
      fibonacciUntilN(n - 1);
      printf("%d ", fibonacci(n));
    }
  }

  // For demonstration
  printf("Enter a number : ");
  var x = scala.io.StdIn.readInt();
  printf("Series of the first %d fibonacci numbers : ", x);
  fibonacciUntilN(x);
  printf("\n");

}
